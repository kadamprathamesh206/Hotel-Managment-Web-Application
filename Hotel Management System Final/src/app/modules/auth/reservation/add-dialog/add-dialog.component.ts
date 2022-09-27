import { Component, Inject, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';

@Component({
  selector: 'app-add-dialog',
  templateUrl: './add-dialog.component.html',
  styleUrls: ['./add-dialog.component.scss']
})
export class AddDialogComponent implements OnInit {

  addForm = new FormGroup({
    firstName: new FormControl("", [Validators.required]),
    middleName: new FormControl("", []),
    lastName: new FormControl("", [Validators.required]),
    email: new FormControl("", [Validators.required, Validators.pattern("[A-Za-z0-9._%-]+@[A-Za-z0-9._%-]+\\.[a-z]{2,3}")]),
    aadhar: new FormControl("", [Validators.required, Validators.minLength(12), Validators.maxLength(12)]),
    contactNo: new FormControl("", [Validators.required]),
    checkIn_date: new FormControl("", [Validators.required]),
    checkout_date: new FormControl("", [Validators.required]),
    address: new FormControl("", [Validators.required]),
    roomtype: new FormControl("", [Validators.required]),
    bill: new FormControl("", [Validators.required]),
  });

  constructor(
    public dialogRef: MatDialogRef<AddDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
  ) { }

  ngOnInit(): void {
    console.log("dialog opened", this.data);
    this.addForm.get("roomtype")?.patchValue(this.data.title);
    this.addForm.get("bill")?.patchValue(this.data.price);
  }

}
