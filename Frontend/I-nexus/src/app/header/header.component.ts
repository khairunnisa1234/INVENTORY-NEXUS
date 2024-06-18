import { Component, OnInit } from '@angular/core';
 
import { Router } from '@angular/router'; 

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent   {
  

<<<<<<< HEAD
  
  
    
  
  
=======
  adminLogedIn:boolean;
  adminService: any;
  service: any;

  constructor( 
    private router: Router, 
     
  ){ 
    this.adminLogedIn = false;
  }

  ngOnInit(): void {
    this.adminLogedIn = this.adminService.getAdminLogInStatus();
    console.log("this.adminLogedIn : " + this.adminLogedIn);
     
  }
 
  isCustomerLoggedOut(){
    this.service.isCustomerLoggedOut();
  }
 
>>>>>>> 5b083c9e4e6cf774e586321efca63b6cfe11a561
}
