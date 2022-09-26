package com.example.testspringauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
//
//    @GetMapping("/admin")
//    String admin() {
//        return "Hello, Admin";
//    }


    @GetMapping("/")
    String index()    {
        return "Hello, Church people";
    }
}
