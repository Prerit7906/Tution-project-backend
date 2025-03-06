package com.prabal.tution_project.services;

import com.prabal.tution_project.entities.FormDetails;
import com.prabal.tution_project.repositories.FormDetailsRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Data
@Service
public class FormDetailsService {

    @Autowired
    private FormDetailsRepository repo;

    @Autowired
    private JavaMailSender mailSender;

    public ResponseEntity<Iterable<FormDetails>> getAllEntries() {
        return ResponseEntity.ok(repo.findAll());
    }

    public ResponseEntity<?> addNewUser(FormDetails formDetails) {
        repo.save(formDetails);
        sendEmail(formDetails.getEmail(), formDetails.getName());
        return ResponseEntity.ok("User created successfully!!");
    }

    private void sendEmail(String toEmail, String name) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(toEmail);
        message.setSubject("Welcome to Our Platform");
        message.setText("Dear " + name + ",\n\nThank you for registering with us. We are excited to have you on board!\n\nBest Regards,\nTeam VScholar");
        mailSender.send(message);
    }
}
