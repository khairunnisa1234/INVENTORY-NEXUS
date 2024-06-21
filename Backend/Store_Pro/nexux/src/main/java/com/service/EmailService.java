package com.service;


import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;


@Service
public class EmailService {
	
		
	
	
	public void sendMail(String mailBody, String recieverEmailAddress,  String ccAddress) {
		final String username = "shaikkhairunnisa99@gmail.com";
		final String password = "yyvg lkms ammv ksto";
		 String signature = "\n Thank You";
		String subject = "OTP for Reset the Password";
		String salutation = "Dear \n Please use the below One Time Password (OTP) to reset your password \n   ";
		
		String body = salutation + "\n\n" + mailBody + "\n\n" + signature;

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {



			String ccMailAdresses = ccAddress;


			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("shaikkhairunnisa99@gmai.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recieverEmailAddress));

			
			if(ccAddress != null) {
				message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(ccMailAdresses));
			}
			message.setSubject(subject);
			message.setText(body);
			
			message.setHeader("Content-Type", "text/html");
			message.saveChanges();
			
			
			
			Transport.send(message);


		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

	}
	
}
