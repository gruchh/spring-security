package com.example.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Start {

    @Autowired
    private UserRepository userRepository;

    public Start(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;

        User user1 = new User();
        user1.setUsername("Jake");
        user1.setPassword(passwordEncoder.encode("123"));
        user1.setRole("ROLE_ADMIN");
        userRepository.save(user1);

        User user2 = new User();
        user2.setUsername("Bogdan");
        user2.setPassword(passwordEncoder.encode("123"));
        user2.setRole("ROLE_USER");
        userRepository.save(user2);


    }
}
