package com.coin.exchanger.remote.service;

import com.coin.exchanger.remote.response.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class RemoteService {

    private final RestTemplate restTemplate;
    private static final String URI = "https://bittrex.com/api/v1.1/public/";

    public enum OrderType{
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

    @Autowired
    public RemoteService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public ResponseListWrapper<Market> getMarketsRestCall() {
        return this.restTemplate.<ResponseListWrapper<Market>>getForObject(URI + "getmarkets", (Class<ResponseListWrapper<Market>>) (Class<?>) ResponseListWrapper.class);
    }

    public ResponseListWrapper<Currency> getCurrenciesRestCall(){
        return this.restTemplate.<ResponseListWrapper<Currency>>getForObject(URI+"getcurrencies",(Class<ResponseListWrapper<Currency>>) (Class<?>)ResponseListWrapper.class);
    }

    public ResponseWrapper<Tick> getTickerRestCall(String market){
        UriComponentsBuilder builder = UriComponentsBuilder
                .fromUriString(URI+"getticker")
                .queryParam("market", market);
        return  this.restTemplate.<ResponseWrapper<Tick>>getForObject(builder.toUriString(),(Class<ResponseWrapper<Tick>>) (Class<?>)ResponseWrapper.class);
    }

    public ResponseListWrapper<MarketSummary> getMarketSummariesRestCall(){
        return this.restTemplate.<ResponseListWrapper<MarketSummary>>getForObject(URI+"getmarketsummaries",(Class<ResponseListWrapper<MarketSummary>>) (Class<?>)ResponseListWrapper.class);
    }
    
    public ResponseWrapper<MarketSummary> getMarketSummaryRestCall(String market){
        UriComponentsBuilder builder = UriComponentsBuilder
                .fromUriString(URI+"getmarketsummary")
                .queryParam("market", market);
        return  this.restTemplate.<ResponseWrapper<MarketSummary>>getForObject(builder.toUriString(),(Class<ResponseWrapper<MarketSummary>>) (Class<?>)ResponseWrapper.class);

    }

    public ResponseWrapper<OrderWrapper> getOrderBookRestCall(String market, OrderType orderType){
        UriComponentsBuilder builder = UriComponentsBuilder
                .fromUriString(URI+"getorderbook")
                .queryParam("market", market)
                .queryParam("type", orderType.getKey());
        return this.restTemplate.<ResponseWrapper<OrderWrapper>>getForObject(builder.toUriString(),(Class<ResponseWrapper<OrderWrapper>>)(Class<?>)ResponseWrapper.class);
    }

    public void getMarketHistoryRestCall(String market){
        UriComponentsBuilder builder = UriComponentsBuilder
                .fromUriString(URI+"getmarkethistory")
                .queryParam("market", market);
        //
    }
}
