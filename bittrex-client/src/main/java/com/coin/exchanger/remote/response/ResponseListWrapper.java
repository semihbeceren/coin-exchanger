package com.coin.exchanger.remote.response;

import java.util.List;

/**
 * Created By Semih Beceren at 08-Dec-17
 */
public class ResponseListWrapper<T> extends BaseResponse {

    private List<T> result;

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }
}
