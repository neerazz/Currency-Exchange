package com.neeraj.microservice.exchangeservice.controller;

import com.neeraj.microservice.exchangeservice.model.ExchangeRate;
import com.neeraj.microservice.exchangeservice.repository.ExchangeRateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExchangeController {

    @Autowired
    private ExchangeRateRepository exchangeRateRepository;

    @Autowired
    private Environment environment;

    @GetMapping("/exchange/from/{from}/to/{to}")
    private ExchangeRate getRate(@PathVariable("from") String fromCurrency, @PathVariable("to") String toCurrency){
        return exchangeRateRepository.findByCurrencyFromAndCurrencyTo(fromCurrency,toCurrency)
                .setPort(Integer.parseInt(environment.getProperty("local.server.port")));
    }
}
