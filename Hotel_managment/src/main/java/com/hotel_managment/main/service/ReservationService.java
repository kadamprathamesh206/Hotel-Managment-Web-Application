package com.hotel_managment.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel_managment.main.model.Reservation;
import com.hotel_managment.main.repository.ReservationRepo;

@Service
public class ReservationService {

	@Autowired
	private ReservationRepo reservationRepo;

	public Reservation newReservation(Reservation reservation) {
		reservation.setStatus("pending");
		Reservation  fill_reservation= this.reservationRepo.save(reservation);

		return fill_reservation;
	}


	public Reservation getReservation(int id) throws Exception {
		Reservation reservation=     this.reservationRepo.findById(id).orElseThrow(()-> new Exception("User not exit"));
		return reservation;

	}

	public Reservation updatecheckIn(Reservation reservation) throws Exception {
		Reservation db_reservation=     this.reservationRepo.findById(reservation.getId()).orElseThrow(()-> new Exception("User not exit"));
		db_reservation.setStatus("check in");
		db_reservation.setBed(reservation.getBed());
		db_reservation.setRoom_no(reservation.getRoom_no());
		db_reservation.setBill(reservation.getBill());

		Reservation updated_reservation=  this.reservationRepo.save(db_reservation);
		return updated_reservation;
	}
	
	
	public Reservation updateCheckOut(Reservation reservation) throws Exception {
		Reservation db_reservation=     this.reservationRepo.findById(reservation.getId()).orElseThrow(()-> new Exception("User not exit"));
		db_reservation.setStatus("checkout");
		db_reservation.setRemark("paid");
		
		Reservation updated_reservation=this.reservationRepo.save(db_reservation);
		
		return updated_reservation;
		
	}

}
