package com.neeraj.microservice.calculateexchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.neeraj.microservice.calculateexchange")
public class CalculateexchangeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculateexchangeApplication.class, args);
    }

}

