package com.prasun.flightreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prasun.flightreservation.entities.Reservation;


public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
