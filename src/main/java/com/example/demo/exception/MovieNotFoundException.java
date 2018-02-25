package com.example.demo.exception;

import org.springframework.http.HttpStatus;

public class MovieNotFoundException extends ApiException {
    public MovieNotFoundException(final String message, final int errorId) {
        super(HttpStatus.UNAUTHORIZED.value(), message, errorId); //401
    }
}
