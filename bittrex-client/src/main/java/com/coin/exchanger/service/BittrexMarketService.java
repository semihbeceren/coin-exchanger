package com.coin.exchanger.service;

import com.coin.exchanger.remote.response.ResponseGetMarket;
import com.coin.exchanger.remote.result.Market;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BittrexMarketService {

    private final RestTemplate restTemplate;
    private static final String URI = "https://bittrex.com/api/v1.1/public/";

    public BittrexMarketService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
        ResponseGetMarket markets = getMarketsRestCall();
    }

    public ResponseGetMarket getMarketsRestCall() {
        return this.restTemplate.getForObject(URI+"getmarkets", ResponseGetMarket.class);
    }
}
