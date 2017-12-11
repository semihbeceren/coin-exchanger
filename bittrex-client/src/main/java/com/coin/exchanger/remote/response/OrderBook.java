package com.coin.exchanger.remote.response;

import com.coin.exchanger.order.OrderType;
import com.coin.exchanger.remote.response.Order;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashMap;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderBook {

    private HashMap<OrderType,List<Order>> buy;
    private HashMap<OrderType,List<Order>> sell;

    public HashMap<OrderType, List<Order>> getBuy() {
        return buy;
    }

    public void setBuy(HashMap<OrderType, List<Order>> buy) {
        this.buy = buy;
    }

    public HashMap<OrderType, List<Order>> getSell() {
        return sell;
    }

    public void setSell(HashMap<OrderType, List<Order>> sell) {
        this.sell = sell;
    }
}
