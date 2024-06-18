import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {

  constructor() {}

  registerSubmit(form: NgForm) {
    if (form.valid) {
      // Handle the form submission logic here
      console.log('Form Submitted!', form.value);
    } else {
      console.log('Form is invalid');
    }
  }
}
