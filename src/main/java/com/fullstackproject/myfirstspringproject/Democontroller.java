package com.fullstackproject.myfirstspringproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class Democontroller {

    //define a private filed for depedency

    private  Coach myCoach;

    //define a constructor for dependency injection

    @Autowired
    public Democontroller(Coach theCoach){
        myCoach=theCoach;
    }

    //create a getmapping endpoint for api
    @GetMapping("/getdailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
