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

//    @Autowired
//    private CustomerRepository customerRepository;
//    
//    @Autowired
//    private OtpUtil otpUtil;
//    
//    @Autowired
//    private EmailUtil emailUtil;
//    
//    @Autowired
//    private PasswordEncoder passwordEncoder; // Inject PasswordEncoder
//
//    public List<Customer> getAllCustomer() {
//        return customerRepository.findAll();
//    }
//
//    public Customer registerCustomer(Customer customer) {
//        String encryptedPassword = passwordEncoder.encode(customer.getPassword());
//        customer.setPassword(encryptedPassword);
//        return customerRepository.save(customer);
//    }
//
//    public Customer customerLogin(String emailId, String password) {
//        Customer customer = customerRepository.findByEmail(emailId);
//        if (customer != null) {
//            if (passwordEncoder.matches(password, customer.getPassword())) {
//                return customer;
//            }
//        }
//        return null;
//    }
//
//    public String sendOtpToEmail(String emailId) {
//        Customer customer = customerRepository.findByEmail(emailId);
//        String otp = otpUtil.generateOtp();
//        if (customer != null) {    
//            try {
//                emailUtil.sendOtpEmail(customer.getEmail(), customer.getFullName(), otp);
//            } catch (MessagingException e) {
//                throw new RuntimeException("Unable to Send OTP", e);
//            }
//        } else {
//            return "Customer Not Found!!!...";
//        }
//        return otp;
//    }
//
//    public Customer getCustomerByEmail(String emailId) {
//        return customerRepository.findByEmail(emailId);
//    }
//    
//    public Customer getCustomerById(int cId) {
//        return customerRepository.findById(cId).orElse(null);
//    }
//
//    public Customer updateCustomerPassword(Customer customer) {
//        String encryptedPassword = passwordEncoder.encode(customer.getPassword());
//        customer.setPassword(encryptedPassword);
//        return customerRepository.save(customer);
//    }
}
