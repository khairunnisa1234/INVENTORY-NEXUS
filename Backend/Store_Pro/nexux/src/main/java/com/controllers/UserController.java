<<<<<<< HEAD
package com.controllers;

=======
<<<<<<< HEAD
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
=======
package com.controller;
>>>>>>> 5b083c9e4e6cf774e586321efca63b6cfe11a561

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

<<<<<<< HEAD
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
=======
	@Autowired
	 private CustomerDao customerDao;
	
	@GetMapping("getAllCustomer")
	public List<Customer> getAllCustomers(){
		return customerDao.getAllCustomer();
	}
	
	@GetMapping("getCustomerByEmail/{emailId}")
	public Customer getCustomerByEmail(@PathVariable("emailId") String emailId){
		return customerDao.getCustomerByEmail(emailId);
	}
	
	@GetMapping("getCustomerById/{cId}")
	public Customer getCustomerById(@PathVariable("cId") int cId){
		return customerDao.getCustomerById(cId);
	}
	
	@PostMapping("registerCustomer")
	public Customer registerCustomer(@RequestBody Customer customer){
		return customerDao.registerCustomer(customer);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@GetMapping("/customerLogin/{email}/{password}")
    public ResponseEntity<?> customerLogin(@PathVariable String email, @PathVariable String password) {
        Customer customer = customerDao.customerLogin(email, password);
        if (customer != null) {
            return new ResponseEntity(customer, HttpStatus.OK);
        } else {
            return new ResponseEntity("Invalid credentials", HttpStatus.UNAUTHORIZED);
        }
    }
	@GetMapping("sendOtpToEmail/{emailId}")
	public String sendOtpToEmail(@PathVariable("emailId") String emailId){		
		return customerDao.sendOtpToEmail(emailId);
	}
	
	@PutMapping("updateCustomerPassword")
	public Customer updateCustomerPassword(@RequestBody Customer customer){
		return customerDao.updateCustomerPassword(customer);
	}
	
}
>>>>>>> 9e8faaaa3c6ffc18bd28c0c3b604990740a2dbf9
>>>>>>> 5b083c9e4e6cf774e586321efca63b6cfe11a561
