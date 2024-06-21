import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms'; // Import NgForm from @angular/forms
import { UserService } from '../user.service'; // Replace '../user.service' with your actual service path
import { ToastrService } from 'ngx-toastr'; // Import ToastrService for notifications
import { Router } from '@angular/router'; // Import Router for navigation

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  
  User: any; // Define User object
  countries: any; // Define countries array

  constructor(private service: UserService, private toastr: ToastrService, private router: Router) {
    this.User = {
      "userName": "",
      "country": "",
      "emailId": "",
      "password": "",
      "phoneNumber": ""
    };
    this.countries = []; // Initialize countries array
  }

  ngOnInit() {
    this.service.getAllCountries().subscribe((data: any) => {
      this.countries = data; // Fetch countries data from service
    });
  }

  registerSubmit(regForm: NgForm) {
    if (regForm.valid) { // Check if form is valid
      this.User.userName = regForm.value.userName; // Assign form values to User object
      this.User.country = regForm.value.country;
      this.User.emailId = regForm.value.emailId;
      this.User.password = regForm.value.password;
      this.User.phoneNumber = regForm.value.phoneNumber;

      console.log(this.User); // Log user data (you can remove this in production)
      this.service.registerUser(this.User).subscribe(
        (data: any) => {
          console.log(data); // Log response (you can remove this in production)
          this.toastr.success('Registration successful', 'Success'); // Show success notification
          this.router.navigate(['login']); // Navigate to login page after successful registration
        },
        (error: any) => {
          console.error(error); // Log error (you can remove this in production)
          this.toastr.error('Registration failed: ' + error.message, 'Error'); // Show error notification
        }
      );
    }
  }
}
