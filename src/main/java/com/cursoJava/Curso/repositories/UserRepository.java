package com.cursoJava.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoJava.Curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
