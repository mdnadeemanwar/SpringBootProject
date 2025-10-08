package com.fullstackproject.myfirstspringproject.springcoredemo.config;
import com.fullstackproject.myfirstspringproject.springcoredemo.common.Coach;

import com.fullstackproject.myfirstspringproject.springcoredemo.common.Swincoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class sportconfig {

    @Bean
    public Coach swincoach(){
        return new Swincoach();
    }

}
