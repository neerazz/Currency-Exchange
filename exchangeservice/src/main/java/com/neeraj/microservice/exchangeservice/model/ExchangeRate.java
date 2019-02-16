package com.neeraj.microservice.exchangeservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeRate {

    @Id
    private int id;
    private String currencyFrom;
    private String currencyTo;
    private float exchangePrice;
    private int port;

    public ExchangeRate() {
    }

    public ExchangeRate(String currencyFrom, String currencyTo, double exchangePrice) {
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.exchangePrice = Float.parseFloat(String.valueOf(exchangePrice));
    }

    public int getId() {
        return id;
    }

    public ExchangeRate setId(int id) {
        this.id = id;
        return this;
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public ExchangeRate setCurrencyFrom(String currencyFrom) {
        this.currencyFrom = currencyFrom;
        return this;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public ExchangeRate setCurrencyTo(String currencyTo) {
        this.currencyTo = currencyTo;
        return this;
    }

    public float getExchangePrice() {
        return exchangePrice;
    }

    public ExchangeRate setExchangePrice(float exchangePrice) {
        this.exchangePrice = exchangePrice;
        return this;
    }

    public int getPort() {
        return port;
    }

    public ExchangeRate setPort(int port) {
        this.port = port;
        return this;
    }
}
