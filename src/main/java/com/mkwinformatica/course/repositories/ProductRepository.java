package com.mkwinformatica.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mkwinformatica.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
