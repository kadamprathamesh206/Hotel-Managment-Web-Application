package com.hotel_managment.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel_managment.main.model.Reservation;
import com.hotel_managment.main.service.ReservationService;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

	@Autowired
	private ReservationService reservationService;


	@PostMapping("/newReservation")
	public  ResponseEntity<Reservation>  customer_resrvation( @RequestBody Reservation reservation){

		Reservation  saved_reservaation=this.reservationService.newReservation(reservation);

		return new ResponseEntity<Reservation>(saved_reservaation, HttpStatus.CREATED);
	}


	@PutMapping("/updateReservationforCheckIn")
	public ResponseEntity<Reservation> update_reservationByCheckIn(@RequestBody Reservation reservation) throws Exception{
		Reservation  updatedReservation= this.reservationService.updatecheckIn( reservation);
		return new ResponseEntity<Reservation>(updatedReservation,HttpStatus.OK);
	}


	@PutMapping("/updateReservationforCheckOut")
	public ResponseEntity<Reservation> update_reservationByCheckout(@RequestBody Reservation reservation) throws Exception{
		Reservation updatedReservation=   this.reservationService.updateCheckOut(reservation);

		return new ResponseEntity<Reservation>(updatedReservation,HttpStatus.OK);
	}
}
