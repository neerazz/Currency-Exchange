package com.neeraj.microservice.calculateexchange;

import com.neeraj.microservice.calculateexchange.model.CalculatedValue;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "exchange-service", url = "localhost:8000")
public interface CalculateExchangeServiceProxy {

    @GetMapping("/api/exchange/from/{from}/to/{to}")
    public CalculatedValue getRate(@PathVariable("from") String fromCurrency, @PathVariable("to") String toCurrency);
}
