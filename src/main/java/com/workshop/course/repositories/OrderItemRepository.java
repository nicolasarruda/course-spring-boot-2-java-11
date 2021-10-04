package com.workshop.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
