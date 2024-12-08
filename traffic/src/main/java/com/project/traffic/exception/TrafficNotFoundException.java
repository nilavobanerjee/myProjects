package com.project.traffic.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings ("serial")
@ResponseStatus (code = HttpStatus.NOT_FOUND)
public class TrafficNotFoundException extends RuntimeException {
    public TrafficNotFoundException (String message) {
        super (message);
    }

}
