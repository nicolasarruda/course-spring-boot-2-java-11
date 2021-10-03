package com.workshop.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
