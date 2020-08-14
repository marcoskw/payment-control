package com.mkwinformatica.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mkwinformatica.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
