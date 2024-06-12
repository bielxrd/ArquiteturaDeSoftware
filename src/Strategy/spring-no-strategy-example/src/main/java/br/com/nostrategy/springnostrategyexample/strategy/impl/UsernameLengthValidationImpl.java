package br.com.nostrategy.springnostrategyexample.strategy.impl;

import br.com.nostrategy.springnostrategyexample.dto.NewUserRequest;
import br.com.nostrategy.springnostrategyexample.model.exceptions.PasswordLengthException;
import br.com.nostrategy.springnostrategyexample.strategy.NewAccountValidationStrategy;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

@Component
public class UsernameLengthValidationImpl implements NewAccountValidationStrategy {

    @SneakyThrows
    @Override
    public void execute(NewUserRequest newUserRequest) {
        if(newUserRequest.getUsername().length() <= 2){
            throw new PasswordLengthException("Seu nome deve ter mais de 2 caracteres.");
        }
    }
}
