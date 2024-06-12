package br.com.nostrategy.springnostrategyexample.handler;

import br.com.nostrategy.springnostrategyexample.model.exceptions.EmailException;
import br.com.nostrategy.springnostrategyexample.model.exceptions.PasswordLengthException;
import br.com.nostrategy.springnostrategyexample.model.exceptions.PasswordRegexException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionEntityHandler {

    @ExceptionHandler(EmailException.class)
    public ResponseEntity<String> handleEmailException(EmailException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    @ExceptionHandler(PasswordLengthException.class)
    public ResponseEntity<String> handlePasswordLengthException(PasswordLengthException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }

    @ExceptionHandler(PasswordRegexException.class)
    public ResponseEntity<String> handlePasswordRegexException(PasswordRegexException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }

}
