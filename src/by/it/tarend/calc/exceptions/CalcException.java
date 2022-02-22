package by.it.tarend.calc.exceptions;

public class CalcException extends Exception {



    public CalcException() {
    }

    public CalcException(String message) {
        super("Error: " + message);
    }

    public CalcException(String message, Throwable cause) {
        super("Error: " + message, cause);
    }

    public CalcException(Throwable cause) {
        super(cause);
    }
}
