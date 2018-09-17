package com.luobo.exception;

public class CustomException extends Exception {
    public String message;

    public CustomException(String message, String message1) {
        super(message);
        this.message = message1;
    }
}
