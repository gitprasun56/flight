package com.prasun.flightreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prasun.flightreservation.entities.Passenger;


public interface PassengerRepository extends JpaRepository<Passenger, Long>{

}
