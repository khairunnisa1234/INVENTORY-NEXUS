import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  getAllUsers() {
    throw new Error('Method not implemented.');
  }
  getCustomerLoginStatus(): import("@angular/router").MaybeAsync<import("@angular/router").GuardResult> {
    throw new Error('Method not implemented.');
  }

  isUserLoggedIn: boolean;

  constructor(private http: HttpClient) {
    this.isUserLoggedIn = false;
  }

  setIsUserLoggedIn() {
    this.isUserLoggedIn = true;
  }

  getIsUserLoggedIn(): boolean {
    return this.isUserLoggedIn;
  }

  setIsUserLoggedOut() {
    this.isUserLoggedIn = false;
  }

  registerUser(user: any): any {
    return this.http.post('http://localhost:8085/register', user);
  }

  login(loginForm: any): Promise<any> {
    return this.http.post('http://localhost:8085/login', loginForm).toPromise();
  }
  getAllCountries(): any {
    return this.http.get('https://restcountries.com/v3.1/all');
  }
}
