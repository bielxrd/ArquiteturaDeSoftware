package br.com.nostrategy.springnostrategyexample.strategy.impl;

import br.com.nostrategy.springnostrategyexample.dto.NewUserRequest;
import br.com.nostrategy.springnostrategyexample.model.exceptions.PasswordLengthException;
import br.com.nostrategy.springnostrategyexample.repository.UserRepository;
import br.com.nostrategy.springnostrategyexample.strategy.NewAccountValidationStrategy;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

@Component
public class PasswordLengthValidationImpl implements NewAccountValidationStrategy {

    private final UserRepository userRepository;

    public PasswordLengthValidationImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @SneakyThrows
    @Override
    public void execute(NewUserRequest newUserRequest) {
        if(newUserRequest.getPassword().length() < 8 || newUserRequest.getPassword().length() > 12) {
            throw new PasswordLengthException("A senha deve ter no mínimo 8 caracteres e no máximo 12 caracteres.");
        }
    }
}
