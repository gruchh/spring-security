package com.example.springsecurity.Service;

import com.example.springsecurity.Repository.UserRepository;
import com.example.springsecurity.Model.User;
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
