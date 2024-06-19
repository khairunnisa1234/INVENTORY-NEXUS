import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  // private baseUrl = 'http://localhost:8085/';

  isUserLoggedIn: boolean;
  loginStatus: Subject<boolean>;

  constructor(private http: HttpClient) {
    this.isUserLoggedIn = false;
    this.loginStatus = new Subject<boolean>();
  }

  setIsUserLoggedIn() {
    this.isUserLoggedIn = true;
    this.loginStatus.next(true);
  }

  setIsUserLoggedOut() {
    this.isUserLoggedIn = false;
    this.loginStatus.next(false);
  }

  getIsUserLoggedIn(): boolean {
    return this.isUserLoggedIn;
  }

  getUserLoginStatus(): Observable<boolean> {
    return this.loginStatus.asObservable();
  }

  userLogin(user: any): Promise<any> {
    return this.http.post('http://localhost:8888/login', user).toPromise();
  }

  getAllCountries(): Observable<any> {
    return this.http.get('https://restcountries.com/v3.1/all');
  }

  registerUser(user: any): Observable<any> {
    return this.http.post('http://localhost:8888/register', user);
  }

}
