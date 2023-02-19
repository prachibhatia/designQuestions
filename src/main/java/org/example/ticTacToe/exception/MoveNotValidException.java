package org.example.ticTacToe.exception;

public class MoveNotValidException extends RuntimeException{
    public MoveNotValidException() {
    }

    public MoveNotValidException(String message) {
        super(message);
    }

    public MoveNotValidException(String message, Throwable cause) {
        super(message, cause);
    }

    public MoveNotValidException(Throwable cause) {
        super(cause);
    }

    public MoveNotValidException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
