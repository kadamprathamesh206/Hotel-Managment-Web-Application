import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, map, throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  constructor(
    private http: HttpClient,
  ) { }

  signIn(email: string, password: string) {
    return this.http.post("http://localhost:8085/admin/signIn", { email, password }).pipe(
      catchError((err: HttpErrorResponse) => {
        console.log("err in res", err);
        if (err.status === 400) {
          window.alert("Invalid Credentials")
        }
        return throwError(() => err);
      })
    );
  }

  getAllAdmins() {
    return this.http.get("http://localhost:8085/admin/getAllAdmin");
  }

  getAdminById(id: string) {
    return this.http.get("http://localhost:8085/admin/" + id);
  }

  deleteAdmin(id: string) {
    return this.http.delete("http://localhost:8085/admin/delete/" + id);
  }

  addAdmin(obj: any) {
    return this.http.post("http://localhost:8085/admin/newadmin", obj).pipe(
      catchError((err: HttpErrorResponse) => {
        console.log("err in res", err);
        if (err.status === 400) {
          window.alert("Email already exists");
        }
        return throwError(() => err);
      })
    );
  }

  updateAdmin(id: string, obj: any) {
    return this.http.put("http://localhost:8085/admin/update/" + id, obj);
  }
}
