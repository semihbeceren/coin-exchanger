package com.coin.exchanger.market.summary;

import com.coin.exchanger.market.Market;
import com.coin.exchanger.market.summary.ticker.Ticker;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Semih Beceren
 */
@Entity
public class MarketSummary {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Market market;
    private Double high;
    private Double low;
    private Double volume;
    private Double baseVolume;
    @OneToOne(mappedBy = "marketSummary", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true, optional = false)
    private Ticker ticker;
    private Date timeStamp;
    private Integer openBuyOrders;
    private Integer openSellOrders;
    private Double prevDay;
    private Date created;

    public MarketSummary() {
    }

    public MarketSummary(Market market, Double high, Double low, Double volume, Double baseVolume, Ticker ticker, Date timeStamp, Integer openBuyOrders, Integer openSellOrders, Double prevDay, Date created) {
        this.market = market;
        this.high = high;
        this.low = low;
        this.volume = volume;
        this.baseVolume = baseVolume;
        this.ticker = ticker;
        this.timeStamp = timeStamp;
        this.openBuyOrders = openBuyOrders;
        this.openSellOrders = openSellOrders;
        this.prevDay = prevDay;
        this.created = created;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getBaseVolume() {
        return baseVolume;
    }

    public void setBaseVolume(Double baseVolume) {
        this.baseVolume = baseVolume;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getOpenBuyOrders() {
        return openBuyOrders;
    }

    public void setOpenBuyOrders(Integer openBuyOrders) {
        this.openBuyOrders = openBuyOrders;
    }

    public Integer getOpenSellOrders() {
        return openSellOrders;
    }

    public void setOpenSellOrders(Integer openSellOrders) {
        this.openSellOrders = openSellOrders;
    }

    public Double getPrevDay() {
        return prevDay;
    }

    public void setPrevDay(Double prevDay) {
        this.prevDay = prevDay;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Ticker getTicker() {
        return ticker;
    }

    public void setTicker(Ticker ticker) {
        this.ticker = ticker;
    }
}
