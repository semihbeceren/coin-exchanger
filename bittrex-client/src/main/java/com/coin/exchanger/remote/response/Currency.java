package com.coin.exchanger.remote.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Currency {
    private String currency;
    private Integer currencyLong;
    private Double txFee;
    private Boolean isActive;
    private String coinType;
    private Object baseAddress;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getCurrencyLong() {
        return currencyLong;
    }

    public void setCurrencyLong(Integer currencyLong) {
        this.currencyLong = currencyLong;
    }

    public Double getTxFee() {
        return txFee;
    }

    public void setTxFee(Double txFee) {
        this.txFee = txFee;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getCoinType() {
        return coinType;
    }

    public void setCoinType(String coinType) {
        this.coinType = coinType;
    }

    public Object getBaseAddress() {
        return baseAddress;
    }

    public void setBaseAddress(Object baseAddress) {
        this.baseAddress = baseAddress;
    }
}