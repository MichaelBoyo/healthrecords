package com.boyo.healthrecords.services.appointment;

import com.boyo.healthrecords.data.dataTransferObjects.requests.BookAppointmentRequest;
import com.boyo.healthrecords.data.dataTransferObjects.responses.BookAppointmentResponse;
import com.boyo.healthrecords.data.models.Appointment;
import com.boyo.healthrecords.data.models.Patient;
import com.boyo.healthrecords.data.repository.AppointmentRepository;
import com.boyo.healthrecords.exceptions.PatientNotFoundException;
import com.boyo.healthrecords.services.patients.PatientService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final PatientService patientService;


    public AppointmentServiceImpl(AppointmentRepository appointmentRepository, PatientService patientService) {
        this.appointmentRepository = appointmentRepository;
        this.patientService = patientService;
    }

    @Override
    public BookAppointmentResponse bookAppointment(BookAppointmentRequest request) throws PatientNotFoundException {
        Appointment appointment = new Appointment();
        Patient patient = patientService.findPatientByID(request.getPatientId());
        appointment.setPatient(patient);
        appointment.setDate(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));
        appointmentRepository.save(appointment);
        return new BookAppointmentResponse("Appointment booked successfully", getPatientAppointments(patient.getId()));
    }


    @Override
    public List<Appointment> getPatientAppointments(Long patientID) {
        return appointmentRepository.findAll().stream()
                .filter(appointment -> appointment.getPatient().getId().equals(patientID))
                .toList();
    }
}
