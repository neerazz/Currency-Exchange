package com.neeraj.microservice.exchangeservice.controller;

import com.neeraj.microservice.exchangeservice.model.ExchangeRate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExchangeController {

    private static int apiCallCount = 0;

    @GetMapping("/exchange/{from}/{to}")
    private ExchangeRate getRate(@PathVariable("from") String fromCurrency, @PathVariable("to") String toCurrency){
        apiCallCount++;
        System.out.println("apiCallCount value is:" + apiCallCount);
        return new ExchangeRate("INR", "USD", 69.30);
    }
}
