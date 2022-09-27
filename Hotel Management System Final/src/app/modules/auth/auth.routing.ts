import { Routes } from "@angular/router";
import { AdminsComponent } from "./admins/admins.component";
import { BookingsComponent } from "./bookings/bookings.component";
import { HomeComponent } from "./home/home.component";
import { LoginComponent } from "./login/login.component";
import { ReservationComponent } from "./reservation/reservation.component";

export const routes: Routes = [
    {
        path: "home",
        component: HomeComponent
    },
    {
        path: "login",
        component: LoginComponent
    },
    {
        path: "reservation",
        component: ReservationComponent
    },
    {
        path: "bookings",
        component: BookingsComponent
    },
    {
        path: "admins",
        component: AdminsComponent
    }
]