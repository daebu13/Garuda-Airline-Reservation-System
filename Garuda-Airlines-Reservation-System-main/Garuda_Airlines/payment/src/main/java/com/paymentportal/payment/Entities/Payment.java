package com.paymentportal.payment.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment
{
	
 @Id
 private Long id;
 
 private int User_Id;
 
 private long Flight_Id;
 
 private long Amount;
 
 private Boolean Payment_Success;

public Payment() {
	super();
	// TODO Auto-generated constructor stub
}

public Payment(Long id, int user_Id, long flight_Id, long amount, Boolean payment_Success) {
	super();
	this.id = id;
	User_Id = user_Id;
	Flight_Id = flight_Id;
	Amount = amount;
	Payment_Success = payment_Success;
}

@Override
public String toString() {
	return "Payment [id=" + id + ", User_Id=" + User_Id + ", Flight_Id=" + Flight_Id + ", Amount=" + Amount
			+ ", Payment_Success=" + Payment_Success + "]";
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public int getUser_Id() {
	return User_Id;
}

public void setUser_Id(int user_Id) {
	User_Id = user_Id;
}

public long getFlight_Id() {
	return Flight_Id;
}

public void setFlight_Id(long flight_Id) {
	Flight_Id = flight_Id;
}

public long getAmount() {
	return Amount;
}

public void setAmount(long amount) {
	Amount = amount;
}

public Boolean getPayment_Success() {
	return Payment_Success;
}

public void setPayment_Success(Boolean payment_Success) {
	Payment_Success = payment_Success;
}
 
}