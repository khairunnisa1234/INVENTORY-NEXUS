import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../user.service'; // Correct the path as needed

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'] // Corrected to styleUrls
})
export class LoginComponent implements OnInit {

  user: any;

  constructor(private router: Router, private service: UserService) {
    this.user = {
      "emailId": "",
      "password": ""
    };
  }

  ngOnInit() {}

  async loginSubmit(loginForm: any) {
    // Storing the user email under localStorage
    localStorage.setItem("emailId", loginForm.emailId);

    if (loginForm.emailId == 'HR' && loginForm.password == 'HR') {
      this.service.setIsUserLoggedIn();
      this.router.navigate(['products']);
    } else {
      this.user.emailId = loginForm.emailId;
      this.user.password = loginForm.password;

      // Using Post Request
      await this.service.login(this.user).then((data: any) => {
        console.log(data);
        this.user = data;
      });

      if (this.user != null) {
        this.service.setIsUserLoggedIn();
        this.router.navigate(['products']);
      } else {
        alert('Invalid Credentials');
      }
    }
  }
}
