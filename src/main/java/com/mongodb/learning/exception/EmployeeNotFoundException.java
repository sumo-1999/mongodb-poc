package com.mongodb.learning.exception;

public class EmployeeNotFoundException extends  RuntimeException{

    public EmployeeNotFoundException(String message){
        super(message);
    }
}
