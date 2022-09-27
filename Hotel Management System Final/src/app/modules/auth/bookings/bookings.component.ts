import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { ReservationService } from 'src/app/services/reservation.service';
import { CheckinDialogComponent } from './checkin-dialog/checkin-dialog.component';

@Component({
  selector: 'app-bookings',
  templateUrl: './bookings.component.html',
  styleUrls: ['./bookings.component.scss']
})
export class BookingsComponent implements OnInit {

  type = "pending";
  reservationList: any = [];

  constructor(
    private reservationService: ReservationService,
    private dialog: MatDialog,
  ) { }

  ngOnInit(): void {
    this.getData();
  }

  getData() {
    this.reservationService.getAllReservations(this.type).subscribe(res => {
      this.reservationList = res;
    });
  }

  onTypeChange(eventArgs: any) {
    console.log("on typ echange", eventArgs);
    this.type = eventArgs.value;
    this.getData();
  }

  checkIn(id: string) {
    console.log("check in", id);
    this.reservationService.getReservationById(id).subscribe((res: any) => {
      console.log("getReservationById", res);
      if (res) {

        const dialogRef = this.dialog.open(CheckinDialogComponent, {
          width: '60%',
          data: res,
        });

        dialogRef.afterClosed().subscribe(result => {
          console.log('The dialog was closed', result);
          if (result) {
            res['room_no'] = result['room_no'];
            res['bed'] = result['bed'];
            this.reservationService.checkIn(res).subscribe(resp => {
              if (resp) {
                window.alert("Check in successfully");
                this.getData();
              }
            });
          }
        });

      }
    });
  }

  checkOut(data: any) {
    this.reservationService.checkOut(data).subscribe(res => {
      if (res) {
        this.getData();
        window.alert("Check out successfull");
      }
    });
  }
}
