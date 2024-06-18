package com.model;

<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String country;
    private String emailId;
    private String password;
    private String phoneNumber;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
    
    
=======
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Customer {

	@Id@GeneratedValue
	private int cId;
	private String fullName;
	private String mobile;
	private String emailId;
	private String password;
	
	@JsonIgnore
	@OneToMany(mappedBy = "customer")
	List<CartItem> cartItems = new ArrayList<CartItem>();
	
	public Customer() {
	}

	public Customer(int cId, String fullName, String mobile, String emailId, String password,
			List<CartItem> cartItems) {
		super();
		this.cId = cId;
		this.fullName = fullName;
		this.mobile = mobile;
		this.emailId = emailId;
		this.password = password;
		this.cartItems = cartItems;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", fullName=" + fullName + ", mobile=" + mobile + ", emailId=" + emailId
				+ ", password=" + password + ", cartItems=" + cartItems + "]";
	}

//	public String getEmail() {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	public String getEmail1() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public String getEmail1() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
//
//	public Customer orElse(Object object) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public Customer orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

>>>>>>> 9e8faaaa3c6ffc18bd28c0c3b604990740a2dbf9
}