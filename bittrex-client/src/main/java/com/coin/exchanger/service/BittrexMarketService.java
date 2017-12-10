package com.coin.exchanger.service;

import com.coin.exchanger.remote.response.Market;
import com.coin.exchanger.remote.response.ResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BittrexMarketService {

    private final RestTemplate restTemplate;
    private static final String URI = "https://bittrex.com/api/v1.1/public/";

    @Autowired
    public BittrexMarketService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public ResponseWrapper<Market> getMarketsRestCall() {
        return this.restTemplate.<ResponseWrapper<Market>>getForObject(URI + "getmarkets", (Class<ResponseWrapper<Market>>) (Class<?>) ResponseWrapper.class);
    }
}
