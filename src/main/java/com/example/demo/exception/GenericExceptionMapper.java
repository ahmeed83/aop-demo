package com.example.demo.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<ApiException> {

    @Override
    public Response toResponse(final ApiException ex) {
        return Response.status(ex.getStatus()).
                entity(ex.getMessage()).
                type("text/plain").
                build();
    }
}