package com.coin.exchanger.market;

import com.coin.exchanger.remote.response.Currency;
import com.coin.exchanger.remote.response.MarketSummary;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @author Semih Beceren
 */
@Entity
public class Market {

    @Id
    @GeneratedValue
    private Long id;
    private Currency marketCurrency;
    private Currency baseCurrency;
    private String marketName;
    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "market", fetch = FetchType.LAZY)
    private List<MarketSummary> marketSummaries;
    private Double minTradeSize;
    private Boolean isActive;
    private Date createdAt;

    public Market() {
    }

    public Market(Currency marketCurrency, Currency baseCurrency, String marketName, Double minTradeSize, Boolean isActive, Date createdAt) {
        this.marketCurrency = marketCurrency;
        this.baseCurrency = baseCurrency;
        this.marketName = marketName;
        this.minTradeSize = minTradeSize;
        this.isActive = isActive;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Currency getMarketCurrency() {
        return marketCurrency;
    }

    public void setMarketCurrency(Currency marketCurrency) {
        this.marketCurrency = marketCurrency;
    }

    public Currency getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(Currency baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public Double getMinTradeSize() {
        return minTradeSize;
    }

    public void setMinTradeSize(Double minTradeSize) {
        this.minTradeSize = minTradeSize;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public List<MarketSummary> getMarketSummaries() {
        return marketSummaries;
    }

    public void setMarketSummaries(List<MarketSummary> marketSummaries) {
        this.marketSummaries = marketSummaries;
    }
}
