package com.paymentportal.payment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.paymentportal.payment.Entities.Payment;
import com.paymentportal.payment.VO.ResponseTemplateVO;
import com.paymentportal.payment.VO.UserDetails;
import com.paymentportal.payment.VO.flightDetails;
import com.paymentportal.payment.repository.PaymentRepository;

@Service
public class PaymentService 
{

	 @Autowired
	 private PaymentRepository paymentRepository;
	 
	 @Autowired
	 private RestTemplate restTemplate;

	public Payment savePayment(Payment payment)
	{
		
		return paymentRepository.save(payment);
	}

	public ResponseTemplateVO getPaymentwithUserDetails(Long paymentId)
	{
		ResponseTemplateVO  vo= new ResponseTemplateVO();
		Payment payment = paymentRepository.findById(paymentId).get();
		System.err.println(payment);
		
		UserDetails userDetails =
				restTemplate.getForObject("http://USER-DETAILS/api/_getUserDetailsById/"
					+ payment.getUser_Id() ,UserDetails.class);
		flightDetails flightdetails=
				restTemplate.getForObject("http://FLIGHTDETAILS/api/_getflightDetailsById/"
						+ payment.getFlight_Id() ,flightDetails.class);
		
		System.err.println(userDetails);
		vo.setPayment(payment);
		vo.setUserDetails(userDetails);
		vo.setFlightdetails(flightdetails);
		return vo;
	}
}
