package com.mento.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailUtilImpl implements EmailUtil {
	 @Autowired
	 private JavaMailSender emailSender;

	@Override
	public void sendEmail(String to, String subject, String message) {
		 SimpleMailMessage msg = new SimpleMailMessage(); 
		 msg.setFrom("psaemaildemouser@gmail.com");
		 msg.setTo(to); 
		 msg.setSubject(subject); 
		 msg.setText(message);
	     emailSender.send(msg);
	}

}
