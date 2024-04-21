package com.paymentportal.payment.VO;

import com.paymentportal.payment.Entities.Payment;

public class ResponseTemplateVO 

{
 private Payment payment;
 private UserDetails userDetails;
 private flightDetails flightdetails;
public Payment getPayment() {
	return payment;
}
public void setPayment(Payment payment) {
	this.payment = payment;
}
public UserDetails getUserDetails() {
	return userDetails;
}
public void setUserDetails(UserDetails userDetails) {
	this.userDetails = userDetails;
}
public flightDetails getFlightdetails() {
	return flightdetails;
}
public void setFlightdetails(flightDetails flightdetails) {
	this.flightdetails = flightdetails;
}
public ResponseTemplateVO() {
	super();
	// TODO Auto-generated constructor stub
}
public ResponseTemplateVO(Payment payment, UserDetails userDetails, flightDetails flightdetails) {
	super();
	this.payment = payment;
	this.userDetails = userDetails;
	this.flightdetails = flightdetails;
}

}