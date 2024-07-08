package com.example.sis_comanda.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.ErrorResponseException;

import java.time.Instant;

public class NotFoundException extends ErrorResponseException {


    public NotFoundException(String message) {
        super(HttpStatus.NOT_FOUND, asProblemDetail(message), null);
    }

    private static ProblemDetail asProblemDetail(String message) {
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, message);
        problemDetail.setTitle("Not Found");
        problemDetail.setProperty("timestamp", Instant.now());
        return problemDetail;
    }
}
