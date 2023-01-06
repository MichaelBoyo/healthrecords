package com.boyo.healthrecords.data.repository;

import com.boyo.healthrecords.data.models.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
