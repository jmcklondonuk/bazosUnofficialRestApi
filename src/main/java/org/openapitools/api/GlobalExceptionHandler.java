package org.openapitools.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(IOException.class)
    @ResponseBody
    public ResponseEntity<org.openapitools.model.Error> handleIOException(IOException e) {
        org.openapitools.model.Error error = new org.openapitools.model.Error();
        error.setCode("IO_ERROR");
        error.setMessage(e.getMessage());
        return ResponseEntity.badRequest().body(error);
    }

    @ExceptionHandler(InterruptedException.class)
    @ResponseBody
    public ResponseEntity<org.openapitools.model.Error> handleInterruptedException(InterruptedException e) {
        org.openapitools.model.Error error = new org.openapitools.model.Error();
        error.setCode("INTERRUPTED_ERROR");
        error.setMessage(e.getMessage());
        return ResponseEntity.badRequest().body(error);
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<org.openapitools.model.Error> handleAllExceptions(Exception e) {
        org.openapitools.model.Error error = new org.openapitools.model.Error();
        error.setCode("EXCEPTION");
        error.setMessage(e.getMessage());
        return ResponseEntity.badRequest().body(error);
    }
}