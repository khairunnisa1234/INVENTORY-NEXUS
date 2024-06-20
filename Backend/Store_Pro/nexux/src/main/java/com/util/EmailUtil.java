package com.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtil {

	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendOtpEmail(String email, String name, String otp) throws MessagingException {
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage);
		mimeMessageHelper.setTo(email);
		mimeMessageHelper.setSubject("OTP for Reset the Password");
		mimeMessageHelper.setText("Dear" + name + 
				"Please use the below One Time Password (OTP) to reset your password."+

				"One Time Password (OTP):  "+ otp);
		javaMailSender.send(mimeMessage);		
	}
}
