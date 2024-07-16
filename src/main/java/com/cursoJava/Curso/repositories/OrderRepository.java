package com.cursoJava.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoJava.Curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
