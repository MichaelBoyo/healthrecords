package com.boyo.healthrecords.data.repository;

import com.boyo.healthrecords.data.models.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalRecordRepository extends JpaRepository<MedicalRecord, Long> {
}

