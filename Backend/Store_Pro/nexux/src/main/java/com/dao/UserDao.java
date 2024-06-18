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

}