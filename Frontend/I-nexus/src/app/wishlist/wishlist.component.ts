import { Component } from '@angular/core';

@Component({
  selector: 'app-wishlist',
  templateUrl: './wishlist.component.html',
  styleUrls: ['./wishlist.component.css']
})
export class WishlistComponent {
  wishlistItems: any[] = []; // Array to store wishlist items

  constructor() {}

  addToWishlist(item: any): void {
    // Check if item is already in wishlist
    if (!this.isInWishlist(item)) {
      this.wishlistItems.push(item); // Add item to wishlist
    }
  }

  removeFromWishlist(item: any): void {
    // Find index of item in wishlist
    const index = this.wishlistItems.findIndex(i => i.title === item.title);
    if (index !== -1) {
      this.wishlistItems.splice(index, 1); // Remove item from wishlist
    }
  }

  isInWishlist(item: any): boolean {
    // Check if item is in wishlist
    return this.wishlistItems.some(i => i.title === item.title);
  }

  purchase(item: any): void {
    // Implement purchase logic here, e.g., navigate to checkout or handle purchase
    console.log('Purchasing:', item.title);
  }
}
