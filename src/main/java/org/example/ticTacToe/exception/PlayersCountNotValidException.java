package org.example.ticTacToe.exception;

public class PlayersCountNotValidException extends RuntimeException{
    public PlayersCountNotValidException() {
    }

    public PlayersCountNotValidException(String message) {
        super(message);
    }

    public PlayersCountNotValidException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlayersCountNotValidException(Throwable cause) {
        super(cause);
    }

    public PlayersCountNotValidException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
