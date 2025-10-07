package com.fullstackproject.myfirstspringproject.springcoredemo.rest;

import com.fullstackproject.myfirstspringproject.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Democontroller {

    //define a private filed for depedency

    private Coach myCoach;

    //define a constructor for dependency injection

    @Autowired
    public Democontroller(Coach theCoach){
        myCoach=theCoach;
    }

    @GetMapping("/")
    public String home(){
        return "This is our First page";
    }

    //create a getmapping endpoint for api
    @GetMapping("/getdailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
