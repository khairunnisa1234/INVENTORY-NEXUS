// contactus.component.ts

import { Component } from '@angular/core';

@Component({
  selector: 'app-contactus',
  templateUrl: './contactus.component.html',
  styleUrls: ['./contactus.component.css']
})
export class ContactusComponent {

  constructor() { }


  submitForm() {

    console.log("Form submitted!");
  }

}
