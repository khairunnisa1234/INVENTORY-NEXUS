import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { ToastrService } from 'ngx-toastr';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  
  User: any;
  countries: any;

  constructor(private service: UserService, private toastr: ToastrService, private router: Router) {
    this.User = {
      "userName": "",
      "country": "",
      "emailId": "",
      "password": "",
      "phoneNumber": ""
    }
  }

  ngOnInit() {
    this.service.getAllCountries().subscribe((data: any) => { this.countries = data; });
  }

  registerSubmit(regForm: any) {
    this.User.userName = regForm.userName;
    this.User.country = regForm.country;
    this.User.emailId = regForm.emailId;
    this.User.password = regForm.password;
    this.User.phoneNumber = regForm.phoneNumber;

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
