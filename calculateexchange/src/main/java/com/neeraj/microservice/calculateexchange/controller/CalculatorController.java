package com.neeraj.microservice.calculateexchange.controller;

import com.neeraj.microservice.calculateexchange.CalculateExchangeServiceProxy;
import com.neeraj.microservice.calculateexchange.model.CalculatedValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class CalculatorController {

    @Autowired
    private Environment environment;

    @Autowired
    private CalculateExchangeServiceProxy proxy;

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/calculate/from/{from}/to/{to}/{amount}")
    public CalculatedValue getCalculatedvalue(@PathVariable("from") String fromCurrency,
                                              @PathVariable("to") String toCurrency,
                                              @PathVariable("amount") int amount){

        RestTemplate restTemplate = new RestTemplate();
        String externalURI = "http://localhost:8000/api/exchange/from/"+fromCurrency + "/to/" + toCurrency;
        System.out.println("Calling URI: " + externalURI);
        CalculatedValue forObject = restTemplate.getForObject(externalURI, CalculatedValue.class);
        System.out.println(forObject);
        forObject.setAmount(amount);
        double calculatedValue = forObject.getExchangePrice() * amount;
        forObject.setCalculatedAmount(calculatedValue);
        forObject.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        return forObject;
    }

    @GetMapping("/calculate/v2/from/{from}/to/{to}/{amount}")
    public CalculatedValue getCalculatedWithFeign(@PathVariable("from") String fromCurrency,
                                              @PathVariable("to") String toCurrency,
                                              @PathVariable("amount") int amount){

        CalculatedValue forObject = proxy.getRate(fromCurrency,toCurrency);
        forObject.setAmount(amount);
        double calculatedValue = forObject.getExchangePrice() * amount;
        forObject.setCalculatedAmount(calculatedValue);
        log.info(forObject.toString());
        return forObject;
    }
}
