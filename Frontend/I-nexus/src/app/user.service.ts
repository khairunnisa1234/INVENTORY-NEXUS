import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  isUserLoggedIn: boolean;
  loginStatus: Subject<boolean>;

  constructor(private http: HttpClient) {
    this.isUserLoggedIn = false;
    this.loginStatus = new Subject<boolean>();
  }

  resetPassword(email: string): Observable<any> {
    return this.http.post('your-api-endpoint/forgot-password', { email });
  }

  setIsUserLoggedIn() {
    this.isUserLoggedIn = true;
    localStorage.setItem('isUserLoggedIn', 'true');
    this.loginStatus.next(true);
  }

  setIsUserLoggedOut() {
    this.isUserLoggedIn = false;
    localStorage.removeItem('isUserLoggedIn');
    this.loginStatus.next(false);
  }

  getIsUserLoggedIn(): boolean {
    return localStorage.getItem('isUserLoggedIn') === 'true';
  }

  getUserLoginStatus(): Observable<boolean> {
    return this.loginStatus.asObservable();
  }

  userLogin(user: any): Promise<any> {
    return this.http.post('http://localhost:8085/login', user).toPromise();
  }

  getAllCountries(): Observable<any> {
    return this.http.get('https://restcountries.com/v3.1/all');
  }

  registerUser(user: any): Observable<any> {
    return this.http.post('http://localhost:8085/register', user);
  }
  sendOtpToEmail(emailId: any){
    return this.http.get('http://localhost:8090/sendOtpToEmail/'+ emailId);
  }

  updateCustomerPassword(customer: any){
    return this.http.put('http://localhost:8090/updateCustomerPassword', customer);
  }
}
