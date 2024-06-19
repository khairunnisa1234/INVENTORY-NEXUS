package com.controllers;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import com.model.User;
import com.model.UserLogin;
import com.model.request.CreateUserRequest;
import com.service.UserService;
 
import com.dao.UserDao;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@Repository
public class UserController {

	 
	    @Autowired
	    UserService userService;
	    @PostMapping("/signup")
	    public ResponseEntity<?> createUser(@RequestBody CreateUserRequest createUserRequest){
	        User user = userService.createUser(createUserRequest);
	        return ResponseEntity.ok().body(user);
	    }
//
//    @PostMapping("/login")
//    public User loginUser(@RequestBody UserLogin userLogin) {
//        return userDao.loginUser(userLogin);
//    }
}
 
