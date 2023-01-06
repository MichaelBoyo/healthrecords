package com.boyo.healthrecords.data.dataTransferObjects.requests;

public class BookAppointmentRequest {
    private Long patientId;

    public BookAppointmentRequest(Long patientId) {
        this.patientId = patientId;

    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }
}
