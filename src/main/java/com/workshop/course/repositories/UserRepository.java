package com.workshop.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workshop.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
