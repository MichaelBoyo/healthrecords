package com.boyo.healthrecords.services;

import com.boyo.healthrecords.data.dataTransferObjects.responses.AddRecordResponse;
import com.boyo.healthrecords.data.dataTransferObjects.requests.AddRecordRequest;
import com.boyo.healthrecords.data.models.MedicalRecord;
import com.boyo.healthrecords.exceptions.PatientNotFoundException;

import java.util.List;

public interface MedicalRecordService {
    AddRecordResponse addRecord(AddRecordRequest request) throws PatientNotFoundException;
    List<MedicalRecord> getPatientMedicalRecord(Long patientID);


}
