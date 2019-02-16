package com.neeraj.microservice.calculateexchange.controller;

import com.neeraj.microservice.calculateexchange.model.CalculatedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.hateoas.ExposesResourceFor;
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

    @GetMapping("/calculate/{from}/{to}/{amount}")
    public CalculatedValue getCalculatedvalue(@PathVariable("from") String fromCurrency,
                                              @PathVariable("to") String toCurrency,
                                              @PathVariable("amount") int amount){

        RestTemplate restTemplate = new RestTemplate();
        CalculatedValue forObject = restTemplate.getForObject("http://localhost:8090/api/exchange/"+fromCurrency + "/" + toCurrency, CalculatedValue.class);
        System.out.println(forObject);
//        CalculatedValue calculatedValue = new CalculatedValue(forObject.getFromINR(), forObject.getToUSD(), forObject.getExchangePrice(),amount,amount*65.0,8080);
        forObject.setAmount(amount);
        double calculatedValue = forObject.getExchangePrice() * amount;
        forObject.setCalculatedAmount(calculatedValue);
        forObject.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        return forObject;
    }
}
