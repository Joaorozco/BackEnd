package com.backendPortfolio.backend.service;

import com.backendPortfolio.backend.entity.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class MailService {
    @Autowired
    JavaMailSender sender;

    public void sendEmail(Mail mail) {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo("joaquinalexisorozco@gmail.com");

        mailMessage.setSubject(mail.getAffair());
        mailMessage.setText("Email: " + mail.getEmail() + "\n\n" + mail.getMessage());

        sender.send(mailMessage);
    }
}
