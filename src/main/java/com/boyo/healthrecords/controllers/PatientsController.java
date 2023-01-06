package com.boyo.healthrecords.controllers;

import com.boyo.healthrecords.data.dataTransferObjects.requests.BookAppointmentRequest;
import com.boyo.healthrecords.data.dataTransferObjects.requests.RegisterPatientRequest;
import com.boyo.healthrecords.exceptions.PatientNotFoundException;
import com.boyo.healthrecords.services.patients.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientsController {
    private final PatientService patientService;

    public PatientsController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping
    public ResponseEntity<?> registerPatient(@RequestBody RegisterPatientRequest request) {
        return ResponseEntity.ok(patientService.registerPatient(request));
    }
}
