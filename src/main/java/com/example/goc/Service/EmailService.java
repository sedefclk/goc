package com.example.goc.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {


	    private final JavaMailSender firstMailSender;
	    private final JavaMailSender secondMailSender;

	    @Autowired
	    public EmailService(@Qualifier("firstMailSender") JavaMailSender firstMailSender,
	                        @Qualifier("secondMailSender") JavaMailSender secondMailSender) {
	        this.firstMailSender = firstMailSender;
	        this.secondMailSender = secondMailSender;
	    }
	    public void sendFirstMail(String to, String subject, String text) {
	    	try {
	            SimpleMailMessage message = new SimpleMailMessage();
	            message.setFrom("randevugoc57@gmail.com");
	            message.setTo(to);
	            message.setSubject(subject);
	            message.setText(text);
	            firstMailSender.send(message);
	            System.out.println("mail gönderildi");
	        } catch (Exception e) {
	            System.out.println("mail gönderilemedi: " + e.getMessage());
	        }
	    }

    public void sendSecondMail(String to, String subject, String text) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("info@gocrandevu.com");
            message.setTo(to);
            message.setSubject(subject);
            message.setText(text);
            secondMailSender.send(message);
            System.out.println("mail gönderildi");
        } catch (Exception e) {
            System.out.println("mail gönderilemedi: " + e.getMessage());
        }
    }

}
