package com.example.uc1.hello_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

    //UC1                                    http://localhost:8080/hello
    @GetMapping(value = {"/uc1", "/hello"})
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    //UC2 Passing name as query parameter    http://localhost:8080/query?name=Amaan
    @GetMapping("/query")
    public String sayHelloQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

}
