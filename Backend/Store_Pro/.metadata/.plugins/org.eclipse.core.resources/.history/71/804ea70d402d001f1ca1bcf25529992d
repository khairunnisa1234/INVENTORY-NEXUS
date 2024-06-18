package com.model;

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

	
	

}