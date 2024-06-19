package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.model.User;
import com.model.UserLogin;


@Service
public class UserDao {

    @Autowired
    private UserRepository userRepo;
    
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    public User loginUser(UserLogin userLogin) {
        return userRepo.findByEmailIdAndPassword(userLogin.getEmailId(), userLogin.getPassword());
    }
}