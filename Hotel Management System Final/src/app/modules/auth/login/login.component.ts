import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AdminService } from 'src/app/services/admin.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  imgUrl = "https://saif.iitm.ac.in/saifimages/icon-login.png";

  loginForm = new FormGroup({
    email: new FormControl("", [Validators.required]),
    password: new FormControl("", [Validators.required]),
  });

  constructor(
    private router: Router,
    private adminService: AdminService,
  ) { }

  ngOnInit(): void {
  }

  login() {
    const user = this.loginForm.getRawValue();
    this.adminService.signIn(user.email, user.password).subscribe(res => {
      if (res) {
        console.log("res", res);
        localStorage.setItem("user", JSON.stringify(res));
        this.router.navigate(["/bookings"]);
      };
    })
  }
}
