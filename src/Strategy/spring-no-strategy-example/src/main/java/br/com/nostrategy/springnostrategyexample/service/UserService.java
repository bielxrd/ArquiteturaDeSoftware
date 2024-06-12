package br.com.nostrategy.springnostrategyexample.service;

import br.com.nostrategy.springnostrategyexample.dto.NewUserRequest;
import br.com.nostrategy.springnostrategyexample.model.UserEntity;
import br.com.nostrategy.springnostrategyexample.model.exceptions.EmailException;
import br.com.nostrategy.springnostrategyexample.model.exceptions.PasswordLengthException;
import br.com.nostrategy.springnostrategyexample.model.exceptions.PasswordRegexException;
import br.com.nostrategy.springnostrategyexample.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createNewAccount(NewUserRequest request) throws Exception {

        if (request.getPassword().length() < 8 || request.getPassword().length() > 12) {
            throw new PasswordLengthException("The password needs to have more than 8 letters and less than 12 letters");
        }

        if(!request.getPassword().matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[\\W_]).+$")){
            throw new PasswordRegexException("A senha deve ter pelo menos: 1 caractere minusculo, 1 caractere maiusculo, 1 numero e 1 caractere especial");
        }

        if (isValidEmail(request.getEmail())) {
            throw new EmailException("Já existe conta cadastrada com este email!");
        }

        if(!request.getUsername().matches("^[a-zA-Z]+$")){
            throw new PasswordRegexException("O nome deve conter apenas letras.");
        }

        if (request.getUsername().length() < 3) {
            throw new PasswordLengthException("Seu nome deve conter mais de 2 caracteres");
        }

        if (isValidUsername(request.getUsername())) {
            throw new EmailException("Já existe conta cadastrada com este username");
        }

        userRepository.save(UserEntity.
                builder()
                .email(request.getEmail())
                .username(request.getUsername())
                .password(request.getPassword()).build());
    }

    private boolean isValidEmail(String email) {
        return userRepository.findByEmail(email).isPresent();
    }

    private boolean isValidUsername(String username) {
       return this.userRepository.findByUsername(username).isPresent();
    }

}
