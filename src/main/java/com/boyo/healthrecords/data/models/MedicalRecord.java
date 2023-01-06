package com.boyo.healthrecords.data.models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

@Entity
public class MedicalRecord {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double temperature;
    private String diagnosis;
    private String temperatureUnit;
    @ManyToOne
    private Patient recordHolder;
}
