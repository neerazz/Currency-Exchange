package com.neeraj.microservice.exchangeservice.model;

public class ExchangeRate {
    private String fromINR;
    private String toUSD;
    private float exchangePrice;

    public ExchangeRate() {
    }

    public ExchangeRate(String fromINR, String toUSD, double exchangePrice) {
        this.fromINR = fromINR;
        this.toUSD = toUSD;
        this.exchangePrice = Float.parseFloat(String.valueOf(exchangePrice));
    }

    public String getFromINR() {
        return fromINR;
    }

    public void setFromINR(String fromINR) {
        this.fromINR = fromINR;
    }

    public String getToUSD() {
        return toUSD;
    }

    public void setToUSD(String toUSD) {
        this.toUSD = toUSD;
    }

    public float getExchangePrice() {
        return exchangePrice;
    }

    public void setExchangePrice(float exchangePrice) {
        this.exchangePrice = exchangePrice;
    }
}
