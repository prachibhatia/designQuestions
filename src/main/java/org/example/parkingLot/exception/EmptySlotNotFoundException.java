package org.example.parkingLot.exception;

public class EmptySlotNotFoundException extends RuntimeException{
    public EmptySlotNotFoundException() {
    }

    public EmptySlotNotFoundException(String message) {
        super(message);
    }

    public EmptySlotNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptySlotNotFoundException(Throwable cause) {
        super(cause);
    }

    public EmptySlotNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
