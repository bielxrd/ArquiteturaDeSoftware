package br.com.nostrategy.springnostrategyexample.model.exceptions;

public class EmailException extends RuntimeException {
    public EmailException(String message) {
        super(message);
    }
}
