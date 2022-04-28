package com.example.springsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/hello")
    public String hello () {
        return "hello-user";
    }

    @GetMapping("/hello-admin")
    public String helloAdmin () {
        return "hello-admin";
    }
}
