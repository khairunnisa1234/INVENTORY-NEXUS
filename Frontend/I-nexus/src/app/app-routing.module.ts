import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ProductsComponent } from './products/products.component';
import { CategoriesComponent } from './categories/categories.component';
import { CartComponent } from './cart/cart.component';
import { LogoutComponent } from './logout/logout.component';
import { authGuard } from './auth.guard';
import { ForgotpasswordComponent } from './forgotpassword/forgotpassword.component';
import { HomeComponent } from './home/home.component';


const routes: Routes = [
  {path:'',            component:HomeComponent},
  {path:'login',       component:LoginComponent},
  { path: '', redirectTo: '/login', pathMatch: 'full' },

  { path: 'register', component: RegisterComponent },
  { path: 'aboutus', component: AboutusComponent },
  { path: 'contactus', component: CartComponent },
  { path: 'categories',canActivate: [authGuard], component: CategoriesComponent },
  { path: 'products',canActivate: [authGuard], component: ProductsComponent },
  { path: 'cart',canActivate: [authGuard], component: CartComponent },
  { path: 'logout',canActivate: [authGuard], component: LogoutComponent } ,
  { path: 'forgotpassword', component: ForgotpasswordComponent },


  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
