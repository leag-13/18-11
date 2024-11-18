package com.example.demo.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/public/hello")
    public String publicHello() {
        return "Public Hello";
    }

    @GetMapping("/private/hello")
    public String privateHello() {
        return "Private Hello";
    }
}

