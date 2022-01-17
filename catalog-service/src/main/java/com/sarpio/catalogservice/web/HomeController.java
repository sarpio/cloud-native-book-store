package com.sarpio.catalogservice.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${polar.greeting}")
    private String greetings;

    @RefreshScope
    @GetMapping("/")
    public String getGreeting() {
        return greetings;
    }

}
