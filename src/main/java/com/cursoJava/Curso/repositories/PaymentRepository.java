package com.cursoJava.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoJava.Curso.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
