package com.neeraj.microservice.calculateexchange.proxy;

import com.neeraj.microservice.calculateexchange.model.CalculatedValue;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "exchange-service", url = "localhost:8000")
//@FeignClient(name = "exchange-service")
//@FeignClient(name = "api-gateway-service")   // Transfer the service call through API Gateway.
// Adding Hystrix for fault tolerance.
@FeignClient(name = "api-gateway-service", fallback =CalculateExchangeServiceProxyFallback.class )
@RibbonClient(name = "exchange-service")
@Component
public interface CalculateExchangeServiceProxy {

//    @GetMapping("/api/exchange/from/{from}/to/{to}")
    @GetMapping("exchange-service/api/exchange/from/{from}/to/{to}") // Transfer the service call through API Gateway.
    public CalculatedValue getRate(@PathVariable("from") String fromCurrency, @PathVariable("to") String toCurrency);
}