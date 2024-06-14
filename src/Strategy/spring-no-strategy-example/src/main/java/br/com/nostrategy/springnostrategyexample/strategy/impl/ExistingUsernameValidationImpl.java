package br.com.nostrategy.springnostrategyexample.strategy.impl;

import br.com.nostrategy.springnostrategyexample.dto.NewUserRequest;
import br.com.nostrategy.springnostrategyexample.model.exceptions.EmailException;
import br.com.nostrategy.springnostrategyexample.repository.UserRepository;
import br.com.nostrategy.springnostrategyexample.strategy.NewAccountValidationStrategy;
import lombok.SneakyThrows;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class ExistingUsernameValidationImpl implements NewAccountValidationStrategy {
    private final UserRepository userRepository;

    public ExistingUsernameValidationImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @SneakyThrows
    @Override
    public void execute(NewUserRequest newUserRequest) {
        System.out.println("metodo 2");
        if (!isValidUsername(newUserRequest.getUsername())) {
            throw new EmailException("Ja existe usuario com esse username");
        }
    }

    private boolean isValidUsername(String username) {
        return this.userRepository.findByUsername(username).isEmpty();
    }
}
