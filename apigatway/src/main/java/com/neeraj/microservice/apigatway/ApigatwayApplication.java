package com.neeraj.microservice.apigatway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ApigatwayApplication {
    /*

    The URL must be called as below.
    http://localhost:9100/{service-name}/{service-url}

    Example:
    http://localhost:9100/calculate-exchange-service/api/calculate/v2/from/USD/to/INR/1000

     */
    public static void main(String[] args) {
        SpringApplication.run(ApigatwayApplication.class, args);
    }

}
