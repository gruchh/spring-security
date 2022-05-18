package com.example.springsecurity.Service;

import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final JavaMailSender mailSender;
    private final Environment environment;

    public EmailService(JavaMailSender mailSender, Environment environment) {
        this.mailSender = mailSender;
        this.environment = environment;
    }

    public void sendMail () {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        System.out.println(environment.getProperty("spring.mail.username"));
        simpleMailMessage.setFrom(environment.getProperty("spring.mail.username"));
        simpleMailMessage.setTo(environment.getProperty("spring.mail.username"));
        simpleMailMessage.setSubject("Mail sending test");
        simpleMailMessage.setText("Test test");
        mailSender.send(simpleMailMessage);
        System.out.printf("Yeah");
    }

}
