package com.coin.exchanger.service;

import com.coin.exchanger.remote.response.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class BittrexMarketService {

    private final RestTemplate restTemplate;
    private static final String URI = "https://bittrex.com/api/v1.1/public/";

    @Autowired
    public BittrexMarketService(RestTemplateBuilder restTemplateBuilder) {
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


}
