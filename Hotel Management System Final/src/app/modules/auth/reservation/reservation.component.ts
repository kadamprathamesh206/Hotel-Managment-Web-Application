import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { ReservationService } from 'src/app/services/reservation.service';
import { AddDialogComponent } from './add-dialog/add-dialog.component';

@Component({
  selector: 'app-reservation',
  templateUrl: './reservation.component.html',
  styleUrls: ['./reservation.component.scss']
})
export class ReservationComponent implements OnInit {

  rooms: any = [
    { title: "Dulexe", priceText: "1500 Rs per day", price: 1500, src: "https://thumbs.dreamstime.com/b/hotel-room-beautiful-orange-sofa-included-43642330.jpg" },
    { title: "Super Dulexe", priceText: "2000 Rs per day", price: 2000, src: "https://media.istockphoto.com/photos/3d-rendering-beautiful-luxury-bedroom-suite-in-hotel-with-tv-picture-id1066999762?k=20&m=1066999762&s=612x612&w=0&h=BitPXyhBFZQHMfpC9ikX_DReVK6Rd28hH9pRoZW8YAs=" },
    { title: "Dorm", priceText: "500 Rs per day", price: 500, src: "https://d36tnp772eyphs.cloudfront.net/blogs/1/2019/02/Lord-and-Moris-Times-Square-Hotel.jpg" },
  ];

  constructor(
    private reservationService: ReservationService,
    private dialog: MatDialog,
  ) { }

  ngOnInit(): void {
  }

  book(room: any) {
    console.log("room selected", room);

    const dialogRef = this.dialog.open(AddDialogComponent, {
      width: '60%',
      data: room,
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed', result);
      if (result) {
        this.reservationService.addReservation(result).subscribe(res => {
          if (res) {
            window.alert("Reservation done successfully");
          }
        });
      }
    });
  }
}
