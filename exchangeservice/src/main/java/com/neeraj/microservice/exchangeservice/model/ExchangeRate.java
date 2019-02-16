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

    public void setId(int id) {
        this.id = id;
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public void setCurrencyFrom(String currencyFrom) {
        this.currencyFrom = currencyFrom;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public void setCurrencyTo(String currencyTo) {
        this.currencyTo = currencyTo;
    }

    public float getExchangePrice() {
        return exchangePrice;
    }

    public void setExchangePrice(float exchangePrice) {
        this.exchangePrice = exchangePrice;
    }
}
