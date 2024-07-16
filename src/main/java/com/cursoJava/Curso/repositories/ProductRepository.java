package com.cursoJava.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoJava.Curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
