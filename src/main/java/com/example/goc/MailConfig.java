package com.example.goc;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
public class MailConfig {

    @Bean
    public JavaMailSender firstMailSender() {

    	    JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
    	    mailSender.setHost("smtp.gmail.com");
    	    mailSender.setPort(587);
    	    mailSender.setUsername("randevugoc57@gmail.com");
    	    mailSender.setPassword("lgal vcxj patx dklb");
    	    Properties props = mailSender.getJavaMailProperties();
    	    props.put("mail.smtp.starttls.enable", "true");
    	    props.put("mail.smtp.auth", "true");
    	    return mailSender;
    	}



    @Bean
    public JavaMailSender secondMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        // İkinci mail hesabının yapılandırması
        mailSender.setHost("smtpout.secureserver.net");
        mailSender.setPort(587);
        mailSender.setUsername("info@gocrandevu.com");
        mailSender.setPassword("d%cw$gH2jM2?F.J");
        Properties props = mailSender.getJavaMailProperties();
	    props.put("mail.smtp.starttls.enable", "true");
	    props.put("mail.smtp.auth", "true");
        return mailSender;
    }
}
