package com.fullstackproject.myfirstspringproject.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class Cricketcoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Run 10km daily to get the Result!!!!!!";
    }
}
