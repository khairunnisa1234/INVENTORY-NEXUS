import { Component, OnInit } from '@angular/core';
import { WishlistService } from '../wishlist.service';

@Component({
  selector: 'app-wishlist',
  templateUrl: './wishlist.component.html',
  styleUrls: ['./wishlist.component.css']
})
export class WishlistComponent implements OnInit {
  wishlistItems: any[] = [];

  constructor(private wishlistService: WishlistService) {}

  ngOnInit(): void {
    this.wishlistItems = this.wishlistService.getWishlistItems();
  }

  removeFromWishlist(item: any): void {
    this.wishlistService.removeFromWishlist(item);
  }

  purchase(item: any): void {
    console.log('Purchasing:', item.name);
  }
}
