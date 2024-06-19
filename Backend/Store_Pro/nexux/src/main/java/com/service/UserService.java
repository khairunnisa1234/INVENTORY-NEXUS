package com.service;

import com.model.User;
import com.model.request.CreateUserRequest;

public interface UserService {
	User createUser(CreateUserRequest createUserRequest);
}
