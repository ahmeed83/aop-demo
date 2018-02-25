package com.example.demo.exception;

import org.springframework.http.HttpStatus;

public class BookNotFoundException extends ApiException {

    public BookNotFoundException(final String message, final int errorId) {
        super(HttpStatus.FORBIDDEN.value(), message, errorId); //403
    }
}
