package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.emailId = :emailId AND u.password = :password")
    User loginUser(@Param("emailId") String emailId, @Param("password") String password);

    @Query("SELECT u.emailId FROM User u WHERE u.emailId = :emailId")
    String sendOtpToEmailId(@Param("emailId") String emailId);

    @Query("UPDATE User u SET u.password = :password WHERE u.id = :id")
    void updateCustomerPassword(@Param("password") String password, @Param("id") Long id);

	User findByEmailId(String userEmail);
}
