<<<<<<< HEAD
package com.dao;
=======
<<<<<<< HEAD
package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmailIdAndPassword(String emailId, String password);
=======
package dao;
>>>>>>> 5b083c9e4e6cf774e586321efca63b6cfe11a561

import org.springframework.data.jpa.repository.JpaRepository;
import com.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
<<<<<<< HEAD
	User findByEmailIdAndPassword(String emailId, String password);
=======
	

>>>>>>> 9e8faaaa3c6ffc18bd28c0c3b604990740a2dbf9
>>>>>>> 5b083c9e4e6cf774e586321efca63b6cfe11a561
}