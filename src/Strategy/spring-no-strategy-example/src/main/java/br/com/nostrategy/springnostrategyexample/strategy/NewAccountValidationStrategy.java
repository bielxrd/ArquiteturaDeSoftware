package br.com.nostrategy.springnostrategyexample.strategy;

import br.com.nostrategy.springnostrategyexample.dto.NewUserRequest;

public interface NewAccountValidationStrategy {

    void execute(NewUserRequest newUserRequest);
}
