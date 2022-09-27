import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { routes } from './auth.routing';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MaterialModule } from 'src/app/material.module';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { ReservationComponent } from './reservation/reservation.component';
import { AddDialogComponent } from './reservation/add-dialog/add-dialog.component';
import { BookingsComponent } from './bookings/bookings.component';
import { AdminsComponent } from './admins/admins.component';
import { CheckinDialogComponent } from './bookings/checkin-dialog/checkin-dialog.component';
import { AddEditAdminComponent } from './admins/add-edit-admin/add-edit-admin.component';

@NgModule({
  declarations: [
    LoginComponent,
    HomeComponent,
    ReservationComponent,
    AddDialogComponent,
    BookingsComponent,
    AdminsComponent,
    CheckinDialogComponent,
    AddEditAdminComponent
  ],
  imports: [
    CommonModule,
    RouterModule.forChild(routes),
    FormsModule,
    ReactiveFormsModule,
    MaterialModule
  ]
})
export class AuthModule { }
