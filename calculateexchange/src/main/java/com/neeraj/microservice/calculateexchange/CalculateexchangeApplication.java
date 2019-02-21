package com.neeraj.microservice.calculateexchange;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients("com.neeraj.microservice.calculateexchange")
@EnableDiscoveryClient
public class CalculateexchangeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculateexchangeApplication.class, args);
    }

    @Bean
    public Sampler defaultSampler(){
        return Sampler.ALWAYS_SAMPLE;
    }
}

