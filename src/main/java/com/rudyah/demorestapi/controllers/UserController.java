package com.rudyah.demorestapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users")
    public String getUsers() {
        return "hello there";
    }

    @GetMapping("/user/{id}")
    public String getUser(@PathVariable int id){
        return "Hello there user #" + id;
    }

    @GetMapping("/user")
    public String getUser(@RequestParam String name){
        return "Hello " + name;
    }

}
