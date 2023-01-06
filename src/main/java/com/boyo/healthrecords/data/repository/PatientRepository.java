package com.boyo.healthrecords.data.repository;

import com.boyo.healthrecords.data.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
