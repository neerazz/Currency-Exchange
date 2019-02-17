package com.neeraj.microservice.exchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class ExchangeserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExchangeserviceApplication.class, args);
    }

}

