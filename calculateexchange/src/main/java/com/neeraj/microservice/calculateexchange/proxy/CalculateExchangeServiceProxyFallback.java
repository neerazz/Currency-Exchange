package com.neeraj.microservice.calculateexchange.proxy;

import com.neeraj.microservice.calculateexchange.model.CalculatedValue;

public class CalculateExchangeServiceProxyFallback implements CalculateExchangeServiceProxy {

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