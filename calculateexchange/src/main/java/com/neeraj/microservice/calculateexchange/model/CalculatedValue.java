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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getCalculatedAmount() {
        return calculatedAmount;
    }

    public void setCalculatedAmount(double calculatedAmount) {
        this.calculatedAmount = calculatedAmount;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
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
