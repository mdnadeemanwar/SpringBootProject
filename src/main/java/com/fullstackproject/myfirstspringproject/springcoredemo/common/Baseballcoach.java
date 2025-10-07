package com.fullstackproject.myfirstspringproject.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Baseballcoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Run 10km daily for baseball!!!";
    }
}
