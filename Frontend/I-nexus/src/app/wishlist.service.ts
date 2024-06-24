import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class WishlistService {
  private wishlistItems: any[] = [];

  constructor() {}

  getWishlistItems(): any[] {
    return this.wishlistItems;
  }

  addToWishlist(item: any): void {
    if (!this.isInWishlist(item)) {
      this.wishlistItems.push(item);
    }
  }

  removeFromWishlist(item: any): void {
    const index = this.wishlistItems.findIndex(i => i.id === item.id);
    if (index !== -1) {
      this.wishlistItems.splice(index, 1);
    }
  }

  isInWishlist(item: any): boolean {
    return this.wishlistItems.some(i => i.id === item.id);
  }
}
