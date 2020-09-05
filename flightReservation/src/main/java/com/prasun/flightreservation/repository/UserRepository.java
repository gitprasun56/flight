package com.prasun.flightreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prasun.flightreservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);

	

}
