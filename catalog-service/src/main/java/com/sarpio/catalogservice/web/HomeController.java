package com.sarpio.catalogservice.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController

public class HomeController {

    @Value("${polar.greeting}")
    private String greetings;

    @GetMapping("/")
    public String getGreeting() {
        return greetings;
    }

}
