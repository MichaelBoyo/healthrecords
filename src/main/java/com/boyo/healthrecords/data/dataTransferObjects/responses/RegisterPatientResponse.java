package com.boyo.healthrecords.data.dataTransferObjects.responses;

public class RegisterPatientResponse {
    private String message;
    private Long patientId;
    public RegisterPatientResponse(String message, Long id) {
        this.message = message;
        this.patientId = id;
    }

    public Long getPatientId() {
        return patientId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
