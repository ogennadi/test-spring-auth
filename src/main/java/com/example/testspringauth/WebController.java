package com.example.testspringauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    @GetMapping("/")
    String index()    {
        return "Hello, Church people";
    }
}
