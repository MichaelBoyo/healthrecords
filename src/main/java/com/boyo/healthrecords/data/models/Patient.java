package com.boyo.healthrecords.data.models;

import io.micrometer.common.lang.NonNull;
import io.micrometer.common.lang.NonNullFields;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import org.aspectj.lang.annotation.RequiredTypes;


import java.util.List;

@Entity
public class Patient {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String email;
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }
}
