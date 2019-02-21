package com.neeraj.microservice.calculateexchange;

import com.neeraj.microservice.calculateexchange.model.CalculatedValue;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "exchange-service", url = "localhost:8000")
//@FeignClient(name = "exchange-service")
//@FeignClient(name = "api-gateway-service")   // Transfer the service call through API Gateway.
// Adding Hystrix for fault tollarance.
@FeignClient(name = "api-gateway-service", fallback =CalculateExchangeServiceProxyFallback.class )
@RibbonClient(name = "exchange-service")
public interface CalculateExchangeServiceProxy {

//    @GetMapping("/api/exchange/from/{from}/to/{to}")
    @GetMapping("exchange-service/api/exchange/from/{from}/to/{to}") // Transfer the service call through API Gateway.
    public CalculatedValue getRate(@PathVariable("from") String fromCurrency, @PathVariable("to") String toCurrency);
}
class CalculateExchangeServiceProxyFallback implements CalculateExchangeServiceProxy{

    @Override
    public CalculatedValue getRate(String fromCurrency, String toCurrency) {
//       Returning hardcoded values in case of any issue or time out's.
        return new CalculatedValue()
                .setPort(0000)
                .setCurrencyFrom(fromCurrency)
                .setCurrencyTo(toCurrency)
                .setExchangePrice(70);
    }
}