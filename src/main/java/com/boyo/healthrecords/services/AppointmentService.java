package com.boyo.healthrecords.services;

import com.boyo.healthrecords.data.dataTransferObjects.requests.BookAppointmentRequest;
import com.boyo.healthrecords.data.dataTransferObjects.responses.BookAppointmentResponse;
import com.boyo.healthrecords.data.models.Appointment;
import com.boyo.healthrecords.exceptions.PatientNotFoundException;

import java.util.List;

public interface AppointmentService {
    BookAppointmentResponse bookAppointment(BookAppointmentRequest request) throws PatientNotFoundException;
    List<Appointment> getPatientAppointments(Long patientID);
}
