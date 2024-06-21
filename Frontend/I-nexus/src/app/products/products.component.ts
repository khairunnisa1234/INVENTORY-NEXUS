import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent {

  products = [
    { 
      title: 'Phone Model A', 
      description: 'This is Phone Model A', 
      imageUrl: 'https://via.placeholder.com/300x200.png?text=Phone+Model+A',
      category: 'phones'
    },
    { 
      title: 'Phone Model B', 
      description: 'This is Phone Model B', 
      imageUrl: 'https://via.placeholder.com/300x200.png?text=Phone+Model+B',
      category: 'phones'
    },
    { 
      title: 'Phone Model C', 
      description: 'This is Phone Model C', 
      imageUrl: 'https://via.placeholder.com/300x200.png?text=Phone+Model+C',
      category: 'phones'
    },
    { 
      title: 'Phone Model D', 
      description: 'This is Phone Model D', 
      imageUrl: 'https://via.placeholder.com/300x200.png?text=Phone+Model+D',
      category: 'phones'
    },
    { 
      title: 'TV Model X', 
      description: 'This is TV Model X', 
      imageUrl: 'https://via.placeholder.com/300x200.png?text=TV+Model+X',
      category: 'tvs'
    },
    { 
      title: 'TV Model Y', 
      description: 'This is TV Model Y', 
      imageUrl: 'https://via.placeholder.com/300x200.png?text=TV+Model+Y',
      category: 'tvs'
    },
    { 
      title: 'TV Model Z', 
      description: 'This is TV Model Z', 
      imageUrl: 'https://via.placeholder.com/300x200.png?text=TV+Model+Z',
      category: 'tvs'
    },
    { 
      title: 'TV Model W', 
      description: 'This is TV Model W', 
      imageUrl: 'https://via.placeholder.com/300x200.png?text=TV+Model+W',
      category: 'tvs'
    },
    { 
      title: 'Laptop Model P', 
      description: 'This is Laptop Model P', 
      imageUrl: 'https://via.placeholder.com/300x200.png?text=Laptop+Model+P',
      category: 'laptops'
    },
    { 
      title: 'Laptop Model Q', 
      description: 'This is Laptop Model Q', 
      imageUrl: 'https://via.placeholder.com/300x200.png?text=Laptop+Model+Q',
      category: 'laptops'
    },
    { 
      title: 'Laptop Model R', 
      description: 'This is Laptop Model R', 
      imageUrl: 'https://via.placeholder.com/300x200.png?text=Laptop+Model+R',
      category: 'laptops'
    },
    { 
      title: 'Laptop Model S', 
      description: 'This is Laptop Model S', 
      imageUrl: 'https://via.placeholder.com/300x200.png?text=Laptop+Model+S',
      category: 'laptops'
    }
  ];

  constructor(private router: Router) {}

  exploreCategory(category: string): void {
    // Navigate to corresponding component based on category
    if (category === 'phones') {
      this.router.navigateByUrl('/phones');
    } else if (category === 'laptops') {
      this.router.navigateByUrl('/laptops');
    } else if (category === 'tvs') {
      this.router.navigateByUrl('/tvs');
    }
  }
}
