package com.crud.exception.advExceptionHandling.customExceptionHandling;

public class InvalidInputException extends RuntimeException {
    public InvalidInputException(String message) {
        super(message);
    }
}