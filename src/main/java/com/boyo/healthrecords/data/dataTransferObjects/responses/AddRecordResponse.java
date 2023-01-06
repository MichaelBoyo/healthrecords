package com.boyo.healthrecords.data.dataTransferObjects.responses;

public class AddRecordResponse {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AddRecordResponse(String message) {
        this.message = message;
    }
}
