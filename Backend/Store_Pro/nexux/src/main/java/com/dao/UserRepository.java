<<<<<<< HEAD
package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmailIdAndPassword(String emailId, String password);
=======
package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	@Query("from Customer where emailId = :emailId")
	Customer findByEmail(@Param("emailId") String emailId);
	
	

>>>>>>> 9e8faaaa3c6ffc18bd28c0c3b604990740a2dbf9
}