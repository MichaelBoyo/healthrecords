package com.boyo.healthrecords.services;

import com.boyo.healthrecords.data.dataTransferObjects.requests.RegisterPatientRequest;
import com.boyo.healthrecords.data.dataTransferObjects.responses.RegisterPatientResponse;
import com.boyo.healthrecords.data.models.Patient;
import com.boyo.healthrecords.exceptions.PatientNotFoundException;

public interface PatientService {
    RegisterPatientResponse registerPatient(RegisterPatientRequest request);
    Patient findPatientByID(Long patientId) throws PatientNotFoundException;
}
