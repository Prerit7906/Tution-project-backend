package com.prabal.tution_project.services;

import com.prabal.tution_project.entities.FormDetails;
import com.prabal.tution_project.repositories.FormDetailsRepository;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Data
@Service
public class FormDetailsService {

    @Autowired
    private FormDetailsRepository repo;

    public ResponseEntity<Iterable<FormDetails>> getAllEntries() {
        return ResponseEntity.ok(repo.findAll());
    }

    public ResponseEntity<?> addNewUser(FormDetails formDetails) {
        FormDetails formDetails1=repo.save(formDetails);
        if(formDetails1!=null){
            return ResponseEntity.ok("User created successfully!!");
        }
        else return ResponseEntity.badRequest().body("User couldn't be created!");
    }
}
