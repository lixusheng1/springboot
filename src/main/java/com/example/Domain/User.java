package com.example.Domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {
    private Long id;
    private String username;
    private String password;
    private String phone;
    private String email;

}
