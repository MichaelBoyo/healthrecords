package com.boyo.healthrecords.services.patients;

import com.boyo.healthrecords.data.dataTransferObjects.requests.RegisterPatientRequest;
import com.boyo.healthrecords.data.dataTransferObjects.responses.RegisterPatientResponse;
import com.boyo.healthrecords.data.models.Patient;
import com.boyo.healthrecords.data.repository.PatientRepository;
import com.boyo.healthrecords.exceptions.PatientNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService{
    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public RegisterPatientResponse registerPatient(RegisterPatientRequest request) {
        Patient patient = new Patient();
        patient.setEmail(request.getEmail());
        patient.setFirstName(request.getFirstName());
        patient.setLastName(request.getLastName());
        patient.setDateOfBirth(request.getDateOfBirth());
        patient.setPassword(request.getPassword());

        patientRepository.save(patient);
        return new RegisterPatientResponse("patient registered successfully", patient.getId());
    }

    @Override
    public Patient findPatientByID(Long patientId) throws PatientNotFoundException {
        return patientRepository.findById(patientId).orElseThrow(
                () -> new PatientNotFoundException("patient with id "+patientId+" not found")
        );
    }
}
