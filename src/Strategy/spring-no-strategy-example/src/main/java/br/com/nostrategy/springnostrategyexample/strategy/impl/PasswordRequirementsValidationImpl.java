package br.com.nostrategy.springnostrategyexample.strategy.impl;

import br.com.nostrategy.springnostrategyexample.dto.NewUserRequest;
import br.com.nostrategy.springnostrategyexample.model.exceptions.PasswordRegexException;
import br.com.nostrategy.springnostrategyexample.repository.UserRepository;
import br.com.nostrategy.springnostrategyexample.strategy.NewAccountValidationStrategy;
import lombok.SneakyThrows;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class PasswordRequirementsValidationImpl implements NewAccountValidationStrategy {
    @SneakyThrows
    @Override
    public void execute(NewUserRequest newUserRequest) {
        if(!newUserRequest.getPassword().matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[\\W_]).+$")){
            throw new PasswordRegexException("A senha deve ter pelo menos: 1 caractere minusculo, 1 caractere maiusculo, 1 numero e 1 caractere especial");
        }
    }
}
