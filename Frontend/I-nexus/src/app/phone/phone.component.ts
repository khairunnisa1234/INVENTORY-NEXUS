import { Component } from '@angular/core';
import { WishlistService } from '../wishlist.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-phone',
  templateUrl: './phone.component.html',
  styleUrls: ['./phone.component.css']
})
export class PhoneComponent {
  products = [
    { id: 1, name: 'Phone Model A', price: 15000, imageUrl: 'assets/phoneA.jpg' },
    { id: 2, name: 'Phone Model B', price: 20000, imageUrl: 'assets/phoneB.jpg' },
    { id: 3, name: 'Phone Model C', price: 25000, imageUrl: 'assets/phoneC.jpg' },
    { id: 4, name: 'Phone Model D', price: 30000, imageUrl: 'assets/phoneD.jpg' },
    { id: 5, name: 'Phone Model E', price: 35000, imageUrl: 'assets/phoneE.jpg' },
    { id: 6, name: 'Phone Model F', price: 40000, imageUrl: 'assets/phoneF.jpg' }
  ];

  constructor(private wishlistService: WishlistService, private router: Router) {}

  addToCart(product: any) {
    console.log('Added to cart:', product);
  }

  addToWishlist(product: any) {
    this.wishlistService.addToWishlist(product);
    this.router.navigate(['/wishlist']);
  }
}
