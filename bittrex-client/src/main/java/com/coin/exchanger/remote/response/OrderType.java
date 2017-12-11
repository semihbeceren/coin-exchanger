package com.coin.exchanger.remote.response;

/**
 * @author Semih Beceren
 */
public enum OrderType {
    Buy("buy"),
    Sell("sell"),
    Both("both");

    private final String key;

    OrderType(String key) {
        this.key = key;
    }


    public String getKey() {
        return this.key;
    }
}