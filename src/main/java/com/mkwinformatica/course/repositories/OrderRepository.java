package com.mkwinformatica.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mkwinformatica.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
