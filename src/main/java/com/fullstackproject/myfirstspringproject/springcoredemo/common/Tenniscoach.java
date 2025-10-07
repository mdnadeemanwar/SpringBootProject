package com.fullstackproject.myfirstspringproject.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class Tenniscoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Run 12 Km for Tennis coaching!!!";
    }
}
