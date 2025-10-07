package com.fullstackproject.myfirstspringproject.springcoredemo.rest;

import com.fullstackproject.myfirstspringproject.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Democontroller {

    //define a private filed for depedency

    private Coach myCoach;
    private Coach anotherCoach;

    //define a constructor for dependency injection

    @Autowired
    public Democontroller( @Qualifier("cricketcoach") Coach theCoach,
                           @Qualifier("cricketcoach") Coach theanotherCoach){
        myCoach=theCoach;
        anotherCoach = theanotherCoach;
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


    @GetMapping("/check")
    public String check(){
        return "comparing the the beancoach"+(myCoach==anotherCoach);
    }


}
