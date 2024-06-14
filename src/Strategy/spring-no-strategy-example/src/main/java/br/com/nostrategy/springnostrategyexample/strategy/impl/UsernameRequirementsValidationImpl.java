package br.com.nostrategy.springnostrategyexample.strategy.impl;

import br.com.nostrategy.springnostrategyexample.dto.NewUserRequest;
import br.com.nostrategy.springnostrategyexample.model.exceptions.PasswordRegexException;
import br.com.nostrategy.springnostrategyexample.strategy.NewAccountValidationStrategy;
import lombok.SneakyThrows;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(6)
public class UsernameRequirementsValidationImpl implements NewAccountValidationStrategy {

    @SneakyThrows
    @Override
    public void execute(NewUserRequest newUserRequest) {
        if(!newUserRequest.getUsername().matches("^[a-zA-Z]+$")){
            throw new PasswordRegexException("O nome deve conter apenas letras.");
        }
    }
}
