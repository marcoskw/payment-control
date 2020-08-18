package com.mkwinformatica.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mkwinformatica.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
