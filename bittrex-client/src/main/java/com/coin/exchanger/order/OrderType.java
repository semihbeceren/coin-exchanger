package com.coin.exchanger.order;

/**
 * @author Semih Beceren
 */
public enum OrderType {
    BUY("buy"),
    SELL("sell"),
    BOTH("both");

    private final String key;

    OrderType(String key) {
        this.key = key;
    }


    public String getKey() {
        return this.key;
    }
}