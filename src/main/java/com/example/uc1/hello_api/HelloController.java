package com.example.uc1.hello_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @GetMapping(value = {"/uc1", "/hello"})
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}
