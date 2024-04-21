package com.paymentportal.payment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.paymentportal.payment.Entities.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long> 
{

	Payment save(Payment payment);

	Optional<Payment> findById(Long paymentId);

}
