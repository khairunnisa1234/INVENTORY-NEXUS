package com.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.model.User;
import com.model.UserLogin;
import com.dao.UserDao;

@CrossOrigin(origins="http://localhost:4200")
@RestController
//@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserDao userDao;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User savedUser = userDao.saveUser(user);
        return ResponseEntity.ok(savedUser);
    }

    @PostMapping("/login")
    public User loginUser(@RequestBody UserLogin userLogin) {
        return userDao.loginUser(userLogin);
    }
}