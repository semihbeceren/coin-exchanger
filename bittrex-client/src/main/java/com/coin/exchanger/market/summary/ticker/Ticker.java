package com.coin.exchanger.market.summary.ticker;

import com.coin.exchanger.market.summary.MarketSummary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author Semih Beceren
 */
@Entity
public class Ticker {

    @Id
    @GeneratedValue
    private Long id;

    private Double bid;
    private Double ask;
    private Double last;

    @OneToOne
    private MarketSummary marketSummary;

    public Ticker() {
    }

    public Ticker(Double bid, Double ask, Double last) {
        this.bid = bid;
        this.ask = ask;
        this.last = last;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getBid() {
        return bid;
    }

    public void setBid(Double bid) {
        this.bid = bid;
    }

    public Double getAsk() {
        return ask;
    }

    public void setAsk(Double ask) {
        this.ask = ask;
    }

    public Double getLast() {
        return last;
    }

    public void setLast(Double last) {
        this.last = last;
    }

    public MarketSummary getMarketSummary() {
        return marketSummary;
    }

    public void setMarketSummary(MarketSummary marketSummary) {
        this.marketSummary = marketSummary;
    }
}
