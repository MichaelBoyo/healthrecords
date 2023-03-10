package com.boyo.healthrecords.controllers;

import com.boyo.healthrecords.data.dataTransferObjects.requests.AddRecordRequest;
import com.boyo.healthrecords.data.dataTransferObjects.requests.BookAppointmentRequest;
import com.boyo.healthrecords.exceptions.PatientNotFoundException;
import com.boyo.healthrecords.services.appointment.AppointmentService;
import com.boyo.healthrecords.services.medicalRecords.MedicalRecordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/records")
public class MedicalRecordController {
     private final MedicalRecordService medicalRecordService;

    public MedicalRecordController(MedicalRecordService medicalRecordService) {
        this.medicalRecordService = medicalRecordService;
    }
    @PostMapping
    public ResponseEntity<?> bookAppointment(@RequestBody AddRecordRequest request) throws PatientNotFoundException {
        return ResponseEntity.ok(medicalRecordService.addRecord(request));
    }
}
