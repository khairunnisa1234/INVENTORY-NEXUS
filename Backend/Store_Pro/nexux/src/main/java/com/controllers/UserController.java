package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.model.User;
import com.model.UserLogin;
import com.service.EmailService;
import com.util.EmailUtil;
import com.util.OtpUtil;
import com.dao.UserDao;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {

    @Autowired
    private EmailService emailService;

    @Autowired
    private UserDao userDao;
    
    @Autowired
    private EmailUtil emailUtil;
    
    @Autowired
    private OtpUtil otpUtil;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user){
        User savedUser = userDao.save(user);
        return ResponseEntity.ok(savedUser);
    }

    @PostMapping("/login")
    public User loginUser(@RequestBody UserLogin userLogin) {
        return userDao.loginUser(userLogin.getEmailId(), userLogin.getPassword());
    }

    @PutMapping("/updateUserPassword")
    public ResponseEntity<?> updateUserPassword(@RequestBody User user) {
        userDao.updateCustomerPassword(user.getPassword(), user.getId());
        return ResponseEntity.ok("Password updated successfully");
    }

    @GetMapping("/otpToEmail")
    public String sendOtp() {
        String email = "skkhairunnisa453@gmail.com";
        String otp = otpUtil.generateOtp();
        
        try {
            emailService.sendMail("One Time Password (OTP): " + otp, email, null);
        } catch (Exception e) {
            System.out.println("Error in sending email");
            e.printStackTrace();
        }

        return "OTP sent successfully.";
    }
}