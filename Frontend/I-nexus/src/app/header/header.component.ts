import { Component, OnInit } from '@angular/core';
 
import { Router } from '@angular/router'; 

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent implements OnInit  {

  // adminLogedIn:boolean;

  constructor( 
    private router: Router,  
  ){ 
    // this.adminLogedIn = false;
  }

  ngOnInit(): void {
    // this.adminLogedIn = this.adminService.getAdminLogInStatus();
    // console.log("this.adminLogedIn : " + this.adminLogedIn);
  }


  // isCustomerLoggedOut(){
  //   this.service.isCustomerLoggedOut();
  // }
 
}
