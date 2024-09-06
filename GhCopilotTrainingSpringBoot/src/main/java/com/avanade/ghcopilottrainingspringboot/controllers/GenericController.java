package com.avanade.ghcopilottrainingspringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generic")
public class GenericController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello";
    }
}
