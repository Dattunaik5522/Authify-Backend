package com.projectauth.authify_app.service;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final JavaMailSender mailSender;

    @Value("${spring.mail.properties.mail.smtp.from}")
    private String fromEmail;

    public void sendWelcomeEmail(String toEmail, String name) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(fromEmail);
        message.setTo(toEmail);
        message.setSubject("Welcome to Our platform");
        message.setText("Hello "+ name+". \n\nThanks for registering with us!\n\nRegards, \n\nAuthifyTeam");
        mailSender.send(message);
    }

    public void sendResetOtpEmail(String toEmail, String  otp) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(fromEmail);
        message.setTo(toEmail);
        message.setSubject("Password reset otp");
        message.setText("Yur OTP for resetting your password is "+ otp+". use this otp to proceed with resetting your password.");
        mailSender.send(message);
    }

    public void sendOtpEmail(String toEmail, String otp){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(fromEmail);
        message.setTo(toEmail);
        message.setSubject("Account verification OTP");
        message.setText("Your OTP is "+ otp+ " to verify your account");
        mailSender.send(message);
    }
}
