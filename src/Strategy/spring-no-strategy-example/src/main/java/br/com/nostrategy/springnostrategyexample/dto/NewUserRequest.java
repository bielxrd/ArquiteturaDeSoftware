package br.com.nostrategy.springnostrategyexample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewUserRequest {

    private String username;
    private String email;
    private String password;
}
