package com.example.uc1.hello_api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
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

    //UC3 Passing name as path variable      http://localhost:8080/param/Amaan
    @GetMapping(value = {"/param/{name}", "/uc2"})
    public String sayHelloPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    // UC4 POST request that accepts user data
    @PostMapping("/post")
    public String sayHello(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

}
