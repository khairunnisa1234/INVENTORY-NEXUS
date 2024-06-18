import { Component } from '@angular/core';
import { ToastrService } from 'ngx-toastr';
import { UserService } from '../user.service';

@Component({
  selector: 'app-forgotpassword',
  templateUrl: './forgotpassword.component.html',
  styleUrls: ['./forgotpassword.component.css']
})
export class ForgotpasswordComponent {

  constructor(private toastr: ToastrService, private userService: UserService) {}

  onSubmit(formValue: any) {
    this.userService.resetPassword(formValue.emailId).subscribe(
      (response: any) => {
        this.toastr.success('Password reset link has been sent to your email', 'Success');
      },
      (error: any) => {
        this.toastr.error('Failed to send password reset link', 'Error');
      }
    );
  }
}
