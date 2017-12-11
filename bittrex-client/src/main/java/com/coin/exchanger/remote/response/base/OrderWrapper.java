package com.coin.exchanger.remote.response.base;

import com.coin.exchanger.remote.response.Order;

import java.util.List;

/**
 * Created by U0T8673 on 11.12.2017.
 */
public class OrderWrapper {

    private List<Order> buy;
    private List<Order> sell;

    public List<Order> getBuy() {
        return buy;
    }

    public void setBuy(List<Order> buy) {
        this.buy = buy;
    }

    public List<Order> getSell() {
        return sell;
    }

    public void setSell(List<Order> sell) {
        this.sell = sell;
    }
}
