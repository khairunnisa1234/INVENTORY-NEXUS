import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  
  User: any;
  countries: any;

  constructor(private service: UserService) {
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
    this.service.registerUser(this.User).subscribe((data: any) => {
      console.log(data);
    });
  }
}