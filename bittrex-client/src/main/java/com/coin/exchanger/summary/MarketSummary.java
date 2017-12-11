package com.coin.exchanger.summary;

import com.coin.exchanger.market.Market;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
    private Double last;
    private Double baseVolume;
    private Date timeStamp;
    private Double bid;
    private Double ask;
    private Integer openBuyOrders;
    private Integer openSellOrders;
    private Double prevDay;
    private Date created;

    public MarketSummary() {
    }

    public MarketSummary(Market market, Double high, Double low, Double volume, Double last, Double baseVolume, Date timeStamp, Double bid, Double ask, Integer openBuyOrders, Integer openSellOrders, Double prevDay, Date created) {
        this.market = market;
        this.high = high;
        this.low = low;
        this.volume = volume;
        this.last = last;
        this.baseVolume = baseVolume;
        this.timeStamp = timeStamp;
        this.bid = bid;
        this.ask = ask;
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

    public Double getLast() {
        return last;
    }

    public void setLast(Double last) {
        this.last = last;
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

}
