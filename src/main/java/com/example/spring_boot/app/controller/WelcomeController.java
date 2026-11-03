package com.example.spring_boot.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {

    @GetMapping("/welcome")
    public ResponseEntity<String> welcome(){
        return ResponseEntity.ok("Welcome to Spring Boot Application");
    }

    @GetMapping("/bye")
    public ResponseEntity<String> byebye(){
        return ResponseEntity.ok("Bye Bye from Spring Boot Application");
    }
}
