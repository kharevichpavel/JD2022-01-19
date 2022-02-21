package by.it._classwork_.calculator.exceptions;

@SuppressWarnings("unused")
public class ApplacitionException extends RuntimeException{

    public ApplacitionException() {
    }

    public ApplacitionException(String message) {
        super(message);
    }

    public ApplacitionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApplacitionException(Throwable cause) {
        super(cause);
    }
}
