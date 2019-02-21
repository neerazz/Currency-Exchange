package com.neeraj.microservice.calculateexchange;

import com.neeraj.microservice.calculateexchange.model.CalculatedValue;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "exchange-service", url = "localhost:8000")
//@FeignClient(name = "exchange-service")
@FeignClient(name = "api-gateway-service")   // Transfer the service call through API Gateway.
@RibbonClient(name = "exchange-service")
public interface CalculateExchangeServiceProxy {

//    @GetMapping("/api/exchange/from/{from}/to/{to}")
    @GetMapping("exchange-service/api/exchange/from/{from}/to/{to}") // Transfer the service call through API Gateway.
    public CalculatedValue getRate(@PathVariable("from") String fromCurrency, @PathVariable("to") String toCurrency);
}
