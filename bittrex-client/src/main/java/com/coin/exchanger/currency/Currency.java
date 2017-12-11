package com.coin.exchanger.currency;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Semih Beceren
 */
@Entity
public class Currency {

    @Id
    @GeneratedValue
    private Long id;
    private String currency;
    private Double txFee;
    private Boolean isActive;
    private String coinType;

    public Currency() {
    }

    public Currency(String currency, Double txFee, Boolean isActive, String coinType) {
        this.currency = currency;
        this.txFee = txFee;
        this.isActive = isActive;
        this.coinType = coinType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
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
}
