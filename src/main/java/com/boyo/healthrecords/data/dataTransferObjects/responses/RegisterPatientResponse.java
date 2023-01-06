package com.boyo.healthrecords.data.dataTransferObjects.responses;

public class RegisterPatientResponse {
    private String message;
    public RegisterPatientResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
