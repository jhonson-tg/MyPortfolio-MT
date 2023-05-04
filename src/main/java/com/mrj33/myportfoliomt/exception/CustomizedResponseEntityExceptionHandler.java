package com.mrj33.myportfoliomt.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestController
@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest req) {
        ExceptionResponse response = new ExceptionResponse(new Date(), ex.getMessage(), "Not_Ok");
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request
    ) {
        String errorMessage = "";
        String seperator = "";
        for(FieldError error: ex.getBindingResult().getFieldErrors()) {
            errorMessage += (seperator + error.getDefaultMessage());
            seperator = "&";
        }
        ExceptionResponse response = new ExceptionResponse(new Date(), errorMessage, "Not_Ok");
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
