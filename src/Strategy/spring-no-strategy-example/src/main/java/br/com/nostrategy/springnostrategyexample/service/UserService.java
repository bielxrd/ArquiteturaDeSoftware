package br.com.nostrategy.springnostrategyexample.service;

import br.com.nostrategy.springnostrategyexample.dto.NewUserRequest;
import br.com.nostrategy.springnostrategyexample.model.UserEntity;
import br.com.nostrategy.springnostrategyexample.model.exceptions.EmailException;
import br.com.nostrategy.springnostrategyexample.model.exceptions.PasswordLengthException;
import br.com.nostrategy.springnostrategyexample.model.exceptions.PasswordRegexException;
import br.com.nostrategy.springnostrategyexample.repository.UserRepository;
import br.com.nostrategy.springnostrategyexample.strategy.NewAccountValidationStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final List<NewAccountValidationStrategy> newAccountValidationStrategies;
    private final UserRepository userRepository;

    public UserService(List<NewAccountValidationStrategy> newAccountValidationStrategies, UserRepository userRepository) {
        this.newAccountValidationStrategies = newAccountValidationStrategies;
        this.userRepository = userRepository;
    }

    public void createNewAccount(NewUserRequest request) throws Exception {
        newAccountValidationStrategies.forEach(validation -> validation.execute(request));

        userRepository.save(UserEntity.
                builder()
                .email(request.getEmail())
                .username(request.getUsername())
                .password(request.getPassword()).build());
    }

}
