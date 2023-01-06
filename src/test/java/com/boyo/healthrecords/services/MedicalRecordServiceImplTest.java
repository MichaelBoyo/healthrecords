package com.boyo.healthrecords.services;

import com.boyo.healthrecords.data.dataTransferObjects.requests.AddRecordRequest;
import com.boyo.healthrecords.data.dataTransferObjects.requests.RegisterPatientRequest;
import com.boyo.healthrecords.data.dataTransferObjects.responses.AddRecordResponse;
import com.boyo.healthrecords.exceptions.PatientNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.core.AutoConfigureCache;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MedicalRecordServiceImplTest {
    @Autowired
    private MedicalRecordService medicalRecordService;

    @Autowired
    private PatientService patientService;

    AddRecordResponse response;

    @BeforeEach
    void setUp() throws PatientNotFoundException {
        patientService.registerPatient(
                new RegisterPatientRequest("", "",
                        "", "", "")
        );
        response = medicalRecordService.addRecord(
                new AddRecordRequest(1L, 123.5, "well", "celsius")
        );
    }

    @Test
    void addRecord() {
        assertEquals("record added successfully", response.getMessage());
    }

    @Test
    void getPatientMedicalRecord() {
        assertEquals(1, medicalRecordService.getPatientMedicalRecord(1L).size());
    }
}