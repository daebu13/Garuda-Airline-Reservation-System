package com.paymentportal.payment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paymentportal.payment.Entities.Payment;
import com.paymentportal.payment.Service.PaymentService;
import com.paymentportal.payment.VO.ResponseTemplateVO;

@RestController
@RequestMapping("/payments")
public class PaymentController 
{

	 @Autowired
	  private PaymentService paymentService;
	 
	 @PostMapping("/")
	 public Payment savePayment(@RequestBody Payment payment)
	 {
		 
		 return paymentService.savePayment(payment);
	 }
	 
	  @GetMapping("/{id}")
	  public ResponseTemplateVO getPaymentwithUserDetails(@PathVariable("id") Long PaymentId)
	  {
		return paymentService.getPaymentwithUserDetails(PaymentId);
		  
	  }
	  
}
