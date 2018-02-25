package com.example.demo.exception;

public class ApiException extends Exception {

    private int status;
    private String message;
    private int errorId;

    public ApiException(final int status, final String message, final int errorId) {
        this.status = status;
        this.message = message;
        this.errorId = errorId;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public int getErrorId() {
        return errorId;
    }
}
