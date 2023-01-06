package com.boyo.healthrecords.exceptions;

public class PatientNotFoundException extends Exception {
    public PatientNotFoundException(){}
    public PatientNotFoundException(String message){
        super(message);
    }

}
