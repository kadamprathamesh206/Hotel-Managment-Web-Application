package com.hotel_managment.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel_managment.main.model.Reservation;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation, Integer>{

}
