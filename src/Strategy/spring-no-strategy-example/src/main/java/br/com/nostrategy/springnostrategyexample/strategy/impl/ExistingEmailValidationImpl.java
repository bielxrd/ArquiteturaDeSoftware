package br.com.nostrategy.springnostrategyexample.strategy.impl;

import br.com.nostrategy.springnostrategyexample.dto.NewUserRequest;
import br.com.nostrategy.springnostrategyexample.model.exceptions.EmailException;
import br.com.nostrategy.springnostrategyexample.repository.UserRepository;
import br.com.nostrategy.springnostrategyexample.strategy.NewAccountValidationStrategy;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

@Component
public class ExistingEmailValidationImpl implements NewAccountValidationStrategy {

    private final UserRepository userRepository;

    public ExistingEmailValidationImpl(UserRepository userRepository) { this.userRepository = userRepository; }

    @SneakyThrows
    @Override
    public void execute(NewUserRequest newUserRequest) {
        if (!isValidEmail(newUserRequest.getEmail())) {
            throw new EmailException("Ja existe um usuario registrado com esse email");
        }
    }

    private boolean isValidEmail(String email) {
        return this.userRepository.findByEmail(email).isEmpty();
    }
}
