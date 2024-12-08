package com.project.fleet.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomizeResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler (Exception.class)
    public final ResponseEntity<ErrorDetails> handleAllException (Exception ex, WebRequest request) throws Exception {
        ErrorDetails errorDetails = new ErrorDetails (request.getDescription (false), ex.getMessage (),
            LocalDateTime.now ());

        return new ResponseEntity<ErrorDetails> (errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler (FleetNotFoundException.class)
    public final ResponseEntity<ErrorDetails> handleNotFoundException (Exception ex, WebRequest request)
        throws Exception {
        ErrorDetails errorDetails = new ErrorDetails (request.getDescription (false), ex.getMessage (),
            LocalDateTime.now ());

        return new ResponseEntity<ErrorDetails> (errorDetails, HttpStatus.NOT_FOUND);
    }

}
