package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloWorldController {
    @GetMapping("hello")
    public String getMethodName() {
        return "Hello World!";
    }
    
}
