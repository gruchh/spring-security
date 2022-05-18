package com.example.springsecurity.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1")
public class TestRestController {

    @GetMapping("/sendMail")
    public ResponseEntity sendMail () {

        return ResponseEntity.ok("OK");
    }


}
