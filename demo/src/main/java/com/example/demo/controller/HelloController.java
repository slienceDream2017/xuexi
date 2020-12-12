package com.example.demo.controller;

import com.example.demo.aspect.WebLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    @WebLog(description = "test")
    public String hello() {
        return "test Hello, Spring Boot !";
    }
}
