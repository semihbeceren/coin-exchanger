package com.coin.exchanger.service;

import com.coin.exchanger.remote.response.Market;
import com.coin.exchanger.remote.response.ResponseWrapper;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BittrexMarketService {

    private final RestTemplate restTemplate;
    private static final String URI = "https://bittrex.com/api/v1.1/public/";

    public BittrexMarketService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
        ResponseWrapper<Market> markets = getMarketsRestCall();
    }

    public ResponseWrapper<Market> getMarketsRestCall() {
        ResponseWrapper<Market> marketResponseWrapper = new ResponseWrapper<>();
        return this.restTemplate.getForObject(URI + "getmarkets", marketResponseWrapper.getClass());
    }
}
