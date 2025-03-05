package com.prabal.tution_project.services;

import com.prabal.tution_project.entities.FormDetails;
import com.prabal.tution_project.repositories.FormDetailsRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Data
@Service
public class FormDetailsService {

    @Autowired
    private FormDetailsRepository repo;

    public ResponseEntity<Iterable<FormDetails>> getAllEntries() {
        return ResponseEntity.ok(repo.findAll());
    }

    public ResponseEntity<?> addNewUser(FormDetails formDetails) {
        repo.save(formDetails);
        return ResponseEntity.ok("User created successfully!!");
    }
}
