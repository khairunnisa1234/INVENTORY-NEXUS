import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule} from '@angular/common/http'; // Ensure this import is correct

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { LoginComponent } from './login/login.component';
import { FormsModule } from '@angular/forms';
import { ToastrModule } from 'ngx-toastr';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { CartComponent } from './cart/cart.component';
import { RegisterComponent } from './register/register.component';
import { ProductsComponent } from './products/products.component';
import { CategoriesComponent } from './categories/categories.component';
import { ForgotpasswordComponent } from './forgotpassword/forgotpassword.component';
import { UserService } from './user.service';
import { HomeComponent } from './home/home.component';
import { LogoutComponent } from './logout/logout.component';
import { CommonModule } from '@angular/common';
import { FooterComponent } from './footer/footer.component';
import { ContactusComponent } from './contactus/contactus.component';
import { PhoneComponent } from './phone/phone.component';
import { WishlistComponent } from './wishlist/wishlist.component';
import { WishlistService } from './wishlist.service';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AboutusComponent,
    LoginComponent,
    CartComponent,
    RegisterComponent,
    ProductsComponent,
    CategoriesComponent,
    ForgotpasswordComponent,
    HomeComponent,
    LogoutComponent,
    FooterComponent,
    ContactusComponent,
    PhoneComponent,
    WishlistComponent,
    


  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule, 
    ToastrModule.forRoot(),
    BrowserAnimationsModule,
    CommonModule,
    FormsModule
  ],
  providers: [UserService, WishlistService],

  bootstrap: [AppComponent]
})
export class AppModule { }