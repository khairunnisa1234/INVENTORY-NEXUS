import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../user.service';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user: any;

  constructor(private router: Router, private service: UserService, private toastr: ToastrService) {
    this.user = {
      "emailId": "",
      "password": ""
    };
  }

  ngOnInit() {}

  async loginSubmit(loginForm: any) {
    // Storing the user email under localStorage
    localStorage.setItem("emailId", loginForm.emailId);

    if (loginForm.emailId === 'HR' && loginForm.password === 'HR') {
      this.service.setIsUserLoggedIn();
      this.toastr.success('Login successful', 'Success');
      this.router.navigate(['showemps']);
    } else {
      this.user.emailId = loginForm.emailId;
      this.user.password = loginForm.password;

      // Using Post Request
      await this.service.userLogin(this.user).then((data: any) => {
        console.log(data);
        this.user = data;
      });

      if (this.user != null) {
        this.service.setIsUserLoggedIn();
        this.toastr.success('Login successful', 'Success');
        this.router.navigate(['products']);
      } else {
        this.toastr.error('Invalid Credentials', 'Login Failed');
      }
    }
  }
}
