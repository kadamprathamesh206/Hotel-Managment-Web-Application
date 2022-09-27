import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ReservationService {

  constructor(
    private http: HttpClient,
  ) { }

  addReservation(obj: any) {
    return this.http.post("http://localhost:8085/reservation/newReservation", obj);
  }

  getAllReservations(type: string) {
    let url: string;
    switch (type) {
      case "pending":
        url = "http://localhost:8085/reservation/getAllReservationsByPendingStatus";
        break;
      case "checkin":
        url = "http://localhost:8085/reservation/getAllReservationsByCheckInStatus";
        break;
      default:
        url = "http://localhost:8085/reservation/getAllReservationsByCheckOutStatus";
        break;
    }
    return this.http.get(url);
  }

  checkIn(obj: any) {
    return this.http.put("http://localhost:8085/reservation/updateReservationforCheckIn", obj);
  }

  checkOut(obj: any) {
    return this.http.put("http://localhost:8085/reservation/updateReservationforCheckOut", obj);
  }

  getReservationById(id: string) {
    return this.http.get("http://localhost:8085/reservation/getReservation/" + id);
  }
}
