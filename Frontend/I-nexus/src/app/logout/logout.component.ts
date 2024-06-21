import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../user.service';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent {

  constructor(
    private router: Router,
    private userService: UserService,
    private toastr: ToastrService
  ) { }

  logout() {
    this.userService.setIsUserLoggedOut();
    this.toastr.success('Logged out successfully', 'Success');
    this.router.navigate(['/login']);
  }
}
