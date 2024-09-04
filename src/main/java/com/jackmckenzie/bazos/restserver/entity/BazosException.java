package com.jackmckenzie.bazos.restserver.entity;

public class BazosException extends Exception {
    private static final long serialVersionUID = 1L;

    public BazosException(String message, Exception e) {
        super(message, e);
    }
}
