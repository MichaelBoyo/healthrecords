package com.boyo.healthrecords.data.dataTransferObjects.responses;

public class BookAppointmentResponse {
    private String message;

    public String getMessage() {
        return message;
    }

    public BookAppointmentResponse(String message) {
        this.message = message;
    }
}
