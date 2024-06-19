import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { ToastrService } from 'ngx-toastr';
import { Router } from '@angular/router';

interface User {
  userName: string;
  country: string;
  emailId: string;
  password: string;
  phoneNumber: string;
}

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  
  User: User;
  countries: any[];

  constructor(private service: UserService, private toastr: ToastrService, private router: Router) {
    this.User = {
      userName: '',
      country: '',
      emailId: '',
      password: '',
      phoneNumber: ''
    };
    this.countries = [];
  }

  ngOnInit() {
    this.service.getAllCountries().subscribe(
      (data: any) => { this.countries = data; },
      (error: any) => { console.error('Error fetching countries:', error); }
    );
  }

  registerSubmit(regForm: any) {
    if (regForm.valid) {
      this.User.userName = regForm.value.userName;
      this.User.country = regForm.value.country;
      this.User.emailId = regForm.value.emailId;
      this.User.password = regForm.value.password;
      this.User.phoneNumber = regForm.value.phoneNumber;

    console.log(this.User);
    this.service.registerUser(this.User).subscribe(
      (data: any) => {
        console.log(data);
        this.toastr.success('Registration successful', 'Success');
        this.router.navigate(['login']);
      },
      (error: any) => {
        console.error(error);
        this.toastr.error('Registration failed: ' + error.message, 'Error');
      }
    );
  }

  }