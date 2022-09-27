import { Component, Inject, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { AddDialogComponent } from '../../reservation/add-dialog/add-dialog.component';

@Component({
  selector: 'app-checkin-dialog',
  templateUrl: './checkin-dialog.component.html',
  styleUrls: ['./checkin-dialog.component.scss']
})
export class CheckinDialogComponent implements OnInit {

  checkInForm = new FormGroup({
    firstName: new FormControl(),
    middleName: new FormControl(),
    lastName: new FormControl(),
    roomtype: new FormControl(),
    room_no: new FormControl("", [Validators.required]),
    bed: new FormControl("", [Validators.required]),
    checkIn_date: new FormControl(),
    checkout_date: new FormControl(),
  });

  constructor(
    public dialogRef: MatDialogRef<AddDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
  ) { }

  ngOnInit(): void {
    if (this.data) {
      this.checkInForm.patchValue(this.data);
    }
  }

}
