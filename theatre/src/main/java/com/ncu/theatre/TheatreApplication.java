package com.ncu.theatre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ncu")
public class TheatreApplication{

    public static void main(String[] args) {
        SpringApplication.run(TheatreApplication.class, args);
    }
}
