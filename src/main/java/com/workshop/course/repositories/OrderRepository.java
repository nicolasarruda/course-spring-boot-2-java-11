package com.workshop.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
