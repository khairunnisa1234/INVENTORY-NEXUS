import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../user.service';
import { ToastrService } from 'ngx-toastr';

interface User {
  emailId: string;
  password: string;
}

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  user: User = {
    emailId: '',
    password: ''
  };

  constructor(
    private router: Router,
    private service: UserService,
    private toastr: ToastrService
  ) {}

  ngOnInit() {}

  async loginSubmit(loginForm: any) {
    // Storing the user email under localStorage
    localStorage.setItem('emailId', loginForm.emailId);

    if (loginForm.emailId === 'THARUN' && loginForm.password === 'DHONI') {
      this.service.setIsUserLoggedIn();
      this.toastr.success('Login successful', 'Success');
      this.router.navigate(['products']);
    } else {
      this.user.emailId = loginForm.emailId;
      this.user.password = loginForm.password;

      try {
        // Using Post Request
        const data = await this.service.userLogin(this.user);
        console.log(data);

        if (data) {
          this.service.setIsUserLoggedIn();
          this.toastr.success('Login successful', 'Success');
          this.router.navigate(['aboutus']);
        } else {
          this.toastr.error('Invalid Credentials', 'Login Failed');
        }
      } catch (error) {
        this.toastr.error('An error occurred during login', 'Login Failed');
        console.error('Login error:', error);
      }
    }
  }
}
