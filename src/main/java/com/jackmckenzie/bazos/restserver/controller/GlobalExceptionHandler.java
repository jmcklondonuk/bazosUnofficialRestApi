package com.jackmckenzie.bazos.restserver.controller;

import com.jackmckenzie.bazos.restserver.entity.BazosException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(BazosException.class)
    public ResponseEntity<String> handleBazosException(BazosException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
