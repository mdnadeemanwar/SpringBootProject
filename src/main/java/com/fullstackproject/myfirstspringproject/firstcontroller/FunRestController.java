package com.fullstackproject.myfirstspringproject.firstcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello Nadeem";
    }

    @GetMapping("/home")
    public String mainPage(){
        return "Welcome to Spring Boot App";
    }

}
