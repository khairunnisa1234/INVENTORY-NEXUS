package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.User;
import com.model.request.CreateUserRequest;
import com.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao userDao;
	public User createUser(CreateUserRequest createUserRequest) {
        String userEmail = createUserRequest.getEmailId();

        // Check if user with the same email already exists
        User existingUser = userDao.findByEmailId(userEmail);
        if (existingUser != null) {
            throw new IllegalArgumentException("Email address already exists");
        }
        User user = new User(createUserRequest.getUserName(),createUserRequest.getCountry(),createUserRequest.getEmailId(),createUserRequest.getPassword(),createUserRequest.getMobileNumber());
        return userDao.save(user);
    }
}
