package com.store.books.exception;

public class SalesNotFoundException extends RuntimeException{
    public SalesNotFoundException() {
    }

    public SalesNotFoundException(String message) {
        super(message);
    }

    public SalesNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public SalesNotFoundException(Throwable cause) {
        super(cause);
    }

    public SalesNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
