package br.com.nostrategy.springnostrategyexample.model.exceptions;

public class PasswordLengthException extends RuntimeException {

    public PasswordLengthException(String message) {
        super(message);
    }

}
