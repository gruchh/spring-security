package com.example.springsecurity;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerNewUser (User newUser) {
        userRepository.save(newUser);
    }
}
