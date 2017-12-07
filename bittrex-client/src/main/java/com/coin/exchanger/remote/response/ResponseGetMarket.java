package com.coin.exchanger.remote.response;

import com.coin.exchanger.remote.result.Market;

import java.util.List;

public class ResponseGetMarket extends BaseResponse {

    private List<Market> result;

    public List<Market> getResult() {
        return result;
    }

    public void setResult(List<Market> result) {
        this.result = result;
    }
}
