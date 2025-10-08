package com.fullstackproject.myfirstspringproject.springcoredemo.rest;

import com.fullstackproject.myfirstspringproject.springcoredemo.common.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Democontroller {

    //define a private filed for depedency

    private Coach myCoach;


    //define a constructor for dependency injection

    @Autowired
    public Democontroller( @Qualifier("swincoach") Coach theCoach){
        System.out.println("First constructor");
        myCoach=theCoach;
    }

    //define the constructor for the init and destroy

    //define the init method


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
