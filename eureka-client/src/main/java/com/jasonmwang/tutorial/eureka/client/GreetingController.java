package com.jasonmwang.tutorial.eureka.client;

import org.springframework.web.bind.annotation.GetMapping;

public interface GreetingController {
    @GetMapping("/greeting")
    String greeting();
}
