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

  getAllCustomers(){
    return this.http.get('http://localhost:8888/getAllCustomer');
  }
  getCustomerById(cId:number){
    return this.http.get('http://localhost:8888/getCustomerById/'+cId);
  }

  getProducts(){
    return this.http.get('http://localhost:8888/getProducts');
  }
}
