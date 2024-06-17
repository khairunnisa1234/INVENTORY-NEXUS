package config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class EmailConfig {

	@Value("${spring.mail.host}")
	private String mailHost;
	@Value("${spring.mail.port}")
	private String mailPort;
	@Value("${spring.mail.username}")
	private String mailUsername;
	@Value("${spring.mail.password}")
	private String mailPassword;
	
	@Bean
	public JavaMailSender getJavaMailSender(){
		JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
		javaMailSender.setHost(mailHost);
		javaMailSender.setPort(Integer.parseInt(mailPort));
	    javaMailSender.setUsername(mailUsername);
	    javaMailSender.setPassword(mailPassword);
	    
	    Properties props = javaMailSender.getJavaMailProperties();
	    props.put("mail.transport.protocol", "smtp");
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.smtp.ssl.trust", "*"); // Trust all certificates (use cautiously in production)
	    return javaMailSender;
	}
}
