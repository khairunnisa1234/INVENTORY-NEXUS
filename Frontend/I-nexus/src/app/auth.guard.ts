import { inject } from '@angular/core';
import { CanActivateFn } from '@angular/router';
import { UserService } from './user.service';


export const authGuard: CanActivateFn = (route, state) => {

  let service1 = inject(UserService);
  return service1.getCustomerLoginStatus();
};

