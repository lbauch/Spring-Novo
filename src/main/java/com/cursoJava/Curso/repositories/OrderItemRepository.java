package com.cursoJava.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoJava.Curso.entities.OrderItem;
import com.cursoJava.Curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
