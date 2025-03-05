package com.prabal.tution_project.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.processing.Pattern;

@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class FormDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
//    @Pattern(regexp = "Parent|Student|Other", message = "Invalid value. Allowed values are Parent, Student, or Other")
    private String whoIsHim;

    @NotBlank
    private String name;

    private String grade;

    @Email
    @NotBlank
    private String email;

//    @Pattern(regexp = "^[0-9]{10}$", message = "Contact number must be 10 digits and numeric")
    @NotBlank
    private String contactNumber;

    @NotBlank
    private String timezone;

//    @Pattern(regexp = "^[A-Za-z]+$", message = "Country should only contain alphabetical characters")
    @NotBlank
    private String country;

    private String message;

    public FormDetails(Long id, String whoIsHim, String name, String grade, String email, String contactNumber, String timezone, String country, String message) {
        this.id = id;
        this.whoIsHim = whoIsHim;
        this.name = name;
        this.grade = grade;
        this.email = email;
        this.contactNumber = contactNumber;
        this.timezone = timezone;
        this.country = country;
        this.message = message;
    }

    public FormDetails() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWhoIsHim() {
        return whoIsHim;
    }

    public void setWhoIsHim(String whoIsHim) {
        this.whoIsHim = whoIsHim;
    }

    public @NotBlank String getName() {
        return name;
    }

    public void setName(@NotBlank String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public @Email @NotBlank String getEmail() {
        return email;
    }

    public void setEmail(@Email @NotBlank String email) {
        this.email = email;
    }

    public @NotBlank String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(@NotBlank String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public @NotBlank String getTimezone() {
        return timezone;
    }

    public void setTimezone(@NotBlank String timezone) {
        this.timezone = timezone;
    }

    public @NotBlank String getCountry() {
        return country;
    }

    public void setCountry(@NotBlank String country) {
        this.country = country;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "FormDetails{" +
                "id=" + id +
                ", whoIsHim='" + whoIsHim + '\'' +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", email='" + email + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", timezone='" + timezone + '\'' +
                ", country='" + country + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
