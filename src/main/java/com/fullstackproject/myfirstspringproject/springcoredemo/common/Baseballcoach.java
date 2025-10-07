package com.fullstackproject.myfirstspringproject.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class Baseballcoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Run 10km daily for baseball!!!";
    }
}
