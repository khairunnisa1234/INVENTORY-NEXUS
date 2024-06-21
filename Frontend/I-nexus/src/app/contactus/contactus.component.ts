// contactus.component.ts

import { Component } from '@angular/core';

@Component({
  selector: 'app-contactus',
  templateUrl: './contactus.component.html',
  styleUrls: ['./contactus.component.css']
})
export class ContactusComponent {

  constructor() { }

  // Define the submitForm method to handle form submission
  submitForm() {
    // Handle form submission logic here, such as sending data to a backend service
    console.log("Form submitted!");
  }

}
