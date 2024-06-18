package com.model;

public class UserLogin {

	private String emailId;
	private String password;
	
	public UserLogin() {
	    // Default constructor
	}

	public UserLogin(String emailId) {
		this.emailId = emailId;
	}

	public UserLogin(String emailId, String password) {
		this.emailId = emailId;
		this.password = password;
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

	@Override
	public String toString() {
		return "CustomerLogin [emailId=" + emailId + ", password=" + password + "]";
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 5b083c9e4e6cf774e586321efca63b6cfe11a561
