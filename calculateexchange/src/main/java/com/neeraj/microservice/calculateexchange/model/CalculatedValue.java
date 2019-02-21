package com.neeraj.microservice.calculateexchange.model;

public class CalculatedValue {

    private String currencyFrom;
    private String currencyTo;
    private float exchangePrice;
    private int amount;
    private double calculatedAmount;
    private int port;

    public CalculatedValue(String currencyFrom, String currencyTo, float exchangePrice, int amount, double calculatedAmount, int port) {
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.exchangePrice = exchangePrice;
        this.amount = amount;
        this.calculatedAmount = calculatedAmount;
        this.port = port;
    }

    public CalculatedValue() {
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public CalculatedValue setCurrencyFrom(String currencyFrom) {
        this.currencyFrom = currencyFrom;
        return this;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public CalculatedValue setCurrencyTo(String currencyTo) {
        this.currencyTo = currencyTo;
        return this;
    }

    public float getExchangePrice() {
        return exchangePrice;
    }

    public CalculatedValue setExchangePrice(float exchangePrice) {
        this.exchangePrice = exchangePrice;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public CalculatedValue setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public double getCalculatedAmount() {
        return calculatedAmount;
    }

    public CalculatedValue setCalculatedAmount(double calculatedAmount) {
        this.calculatedAmount = calculatedAmount;
        return this;
    }

    public int getPort() {
        return port;
    }

    public CalculatedValue setPort(int port) {
        this.port = port;
        return this;
    }

    @Override
    public String toString() {
        return "CalculatedValue{" +
                "currencyFrom='" + currencyFrom + '\'' +
                ", currencyTo='" + currencyTo + '\'' +
                ", exchangePrice=" + exchangePrice +
                ", amount=" + amount +
                ", calculatedAmount=" + calculatedAmount +
                ", port=" + port +
                '}';
    }
}
