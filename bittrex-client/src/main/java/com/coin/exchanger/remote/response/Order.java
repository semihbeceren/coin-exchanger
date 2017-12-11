package com.coin.exchanger.remote.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by U0T8673 on 11.12.2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Order {
    private Double quantity;
    private Double rate;

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}
