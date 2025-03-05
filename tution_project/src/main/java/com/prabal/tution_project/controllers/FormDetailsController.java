package com.prabal.tution_project.controllers;

import com.prabal.tution_project.entities.FormDetails;
import com.prabal.tution_project.services.FormDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0.0/formDetails")
@CrossOrigin(origins = "http://localhost:5173")
public class FormDetailsController {

    @Autowired
    private FormDetailsService service;

    @GetMapping("/all")
    public ResponseEntity<Iterable<FormDetails>> getAllEntries(){
        return service.getAllEntries();
    }

    @PostMapping("/all")
    public ResponseEntity<?> addNewUser(@RequestBody FormDetails formDetails){
        return service.addNewUser(formDetails);
    }
}
