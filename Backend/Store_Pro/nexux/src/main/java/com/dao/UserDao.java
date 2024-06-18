<<<<<<< HEAD
package com.dao;
=======
<<<<<<< HEAD
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
=======
package dao;

import java.util.List;
>>>>>>> 5b083c9e4e6cf774e586321efca63b6cfe11a561

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

<<<<<<< HEAD
    public User loginUser(UserLogin userLogin) {
        return userRepo.findByEmailIdAndPassword(userLogin.getEmailId(), userLogin.getPassword());
    }
=======
>>>>>>> 9e8faaaa3c6ffc18bd28c0c3b604990740a2dbf9
>>>>>>> 5b083c9e4e6cf774e586321efca63b6cfe11a561
}