package com.icodfee.springstatemachinetutorial.repository;

import com.icodfee.springstatemachinetutorial.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public class PaymentRepository extends JpaRepository<Payment, Long> {
}
