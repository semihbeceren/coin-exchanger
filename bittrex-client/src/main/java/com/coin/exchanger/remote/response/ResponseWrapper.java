package com.coin.exchanger.remote.response;

public class ResponseWrapper<T> extends BaseResponse {

    private T result;

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
