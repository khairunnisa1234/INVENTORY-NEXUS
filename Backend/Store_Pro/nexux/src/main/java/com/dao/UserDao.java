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

import org.springframework.stereotype.Service;

import com.model.Customer;

//import java.util.List;
//import javax.mail.MessagingException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//import com.model.Customer;


@Service
public class CustomerDao {

	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer getCustomerByEmail(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer getCustomerById(int cId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer registerCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer customerLogin(String emailId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public String sendOtpToEmail(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer updateCustomerPassword(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

>>>>>>> 9e8faaaa3c6ffc18bd28c0c3b604990740a2dbf9
}