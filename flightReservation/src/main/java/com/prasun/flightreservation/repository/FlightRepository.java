package com.prasun.flightreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prasun.flightreservation.entities.Flight;


public interface FlightRepository extends JpaRepository<Flight, Long>{

}
