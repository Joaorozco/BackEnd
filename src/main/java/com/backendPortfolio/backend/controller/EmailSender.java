package com.backendPortfolio.backend.controller;

import com.backendPortfolio.backend.entity.Mail;
import com.backendPortfolio.backend.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RestController
@CrossOrigin(origins = "https://front-endportfolio.web.app")
public class EmailSender {
    @Autowired
    MailService mailService;

    @PostMapping("/sendemail")
    public ResponseEntity<Mail> sendMail(@RequestBody Mail mail) {
        mailService.sendEmail(mail);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
