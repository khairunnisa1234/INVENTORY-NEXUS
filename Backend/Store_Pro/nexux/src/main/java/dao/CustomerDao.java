package dao;

import java.util.List;
import javax.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.model.Customer;
import utils.EmailUtil;
import utils.OtpUtil;

@Service
public class CustomerDao {

    @Autowired
    private CustomerRepository customerRepository;
    
    @Autowired
    private OtpUtil otpUtil;
    
    @Autowired
    private EmailUtil emailUtil;
    
    @Autowired
    private PasswordEncoder passwordEncoder; // Inject PasswordEncoder

    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    public Customer registerCustomer(Customer customer) {
        String encryptedPassword = passwordEncoder.encode(customer.getPassword());
        customer.setPassword(encryptedPassword);
        return customerRepository.save(customer);
    }

    public Customer customerLogin(String emailId, String password) {
        Customer customer = customerRepository.findByEmail(emailId);
        if (customer != null) {
            if (passwordEncoder.matches(password, customer.getPassword())) {
                return customer;
            }
        }
        return null;
    }

    public String sendOtpToEmail(String emailId) {
        Customer customer = customerRepository.findByEmail(emailId);
        String otp = otpUtil.generateOtp();
        if (customer != null) {    
            try {
                emailUtil.sendOtpEmail(customer.getEmail(), customer.getFullName(), otp);
            } catch (MessagingException e) {
                throw new RuntimeException("Unable to Send OTP", e);
            }
        } else {
            return "Customer Not Found!!!...";
        }
        return otp;
    }

    public Customer getCustomerByEmail(String emailId) {
        return customerRepository.findByEmail(emailId);
    }
    
    public Customer getCustomerById(int cId) {
        return customerRepository.findById(cId).orElse(null);
    }

    public Customer updateCustomerPassword(Customer customer) {
        String encryptedPassword = passwordEncoder.encode(customer.getPassword());
        customer.setPassword(encryptedPassword);
        return customerRepository.save(customer);
    }
}
