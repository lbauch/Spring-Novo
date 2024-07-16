package com.cursoJava.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoJava.Curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
