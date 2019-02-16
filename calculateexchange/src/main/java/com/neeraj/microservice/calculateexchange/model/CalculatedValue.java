package com.neeraj.microservice.calculateexchange.model;

public class CalculatedValue {

    private String fromINR;
    private String toUSD;
    private float exchangePrice;
    private int amount;
    private double calculatedAmount;
    private int port;

    public CalculatedValue(String fromINR, String toUSD, float exchangePrice, int amount, double calculatedAmount, int port) {
        this.fromINR = fromINR;
        this.toUSD = toUSD;
        this.exchangePrice = exchangePrice;
        this.amount = amount;
        this.calculatedAmount = calculatedAmount;
        this.port = port;
    }

    public CalculatedValue() {
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
                "fromINR='" + fromINR + '\'' +
                ", toUSD='" + toUSD + '\'' +
                ", exchangePrice=" + exchangePrice +
                ", amount=" + amount +
                ", calculatedAmount=" + calculatedAmount +
                ", port=" + port +
                '}';
    }
}
