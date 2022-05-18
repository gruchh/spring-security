package com.example.springsecurity.Controller;

import com.example.springsecurity.Model.User;
import com.example.springsecurity.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello-user")
    public String helloUser() {
        return "hello-user";
    }

    @GetMapping("/hello-admin")
    public String helloAdmin() {
        return "hello-admin";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new User());
        return "sign-up";
    }

    @PostMapping("/register")
    public String registerNewUser(@Valid User user) {
        user.setRole("ROLE_ADMIN");
        userService.registerNewUser(user);
        return "redirect:/";
    }

}
