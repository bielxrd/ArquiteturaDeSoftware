package br.com.nostrategy.springnostrategyexample.model.exceptions;

public class PasswordRegexException extends RuntimeException {
    public PasswordRegexException(String message) {
        super(message);
    }
}
