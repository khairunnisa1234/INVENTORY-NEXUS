import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

  adminLoginStatus :boolean; 

  constructor(private http : HttpClient) { 
    this.adminLoginStatus = false;
  }

  adminLogin(){
    this.adminLoginStatus = true; 
  }
  adminLogout(){
    this.adminLoginStatus = false;
  } 

  getAllUsers(){
    return this.http.get('http://localhost:8085/getAllUsers');
  }
  getUserById(cId:number){
    return this.http.get('http://localhost:8085/getUserById/'+cId);
  }

  getProducts(){
    return this.http.get('http://localhost:8085/getProducts');
  }
}
