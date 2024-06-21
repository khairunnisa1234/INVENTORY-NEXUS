import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../user.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  isLoggedIn: boolean;

  constructor(private router: Router, private userService: UserService) {
    this.isLoggedIn = false;
  }

  ngOnInit() {
    this.userService.getUserLoginStatus().subscribe(isLoggedIn => {
      this.isLoggedIn = isLoggedIn;
    });
    this.isLoggedIn = this.userService.getIsUserLoggedIn();
  }

  logout() {
    this.userService.setIsUserLoggedOut();
    this.router.navigate(['/login']);
  }
}
