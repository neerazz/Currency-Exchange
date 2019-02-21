package com.neeraj.microservice.exchangeservice.controller;

import com.neeraj.microservice.exchangeservice.model.ExchangeRate;
import com.neeraj.microservice.exchangeservice.repository.ExchangeRateRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/exchange/from/{from}/to/{to}")
    private ExchangeRate getRate(@PathVariable("from") String fromCurrency, @PathVariable("to") String toCurrency){

        Integer port = Integer.parseInt(environment.getProperty("local.server.port"));
        log.info("The exchange request to convert {} to {} is running on port: {}", fromCurrency, toCurrency,port);
        return exchangeRateRepository.findByCurrencyFromAndCurrencyTo(fromCurrency,toCurrency)
                .setPort(port);
    }
}
