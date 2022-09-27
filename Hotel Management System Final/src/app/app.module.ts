import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MaterialModule } from './material.module';
import { AuthGuardService } from './services/auth-guard.service';
import { RouteGuardService } from './services/route-guard.service';
import { AdminService } from './services/admin.service';
import { HttpClientModule } from '@angular/common/http';
import { ReservationService } from './services/reservation.service';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MaterialModule,
    HttpClientModule
  ],
  providers: [
    AuthGuardService, 
    RouteGuardService,
    AdminService,
    ReservationService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
