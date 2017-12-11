package com.coin.exchanger.bittrexclient;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.coin.exchanger.order.OrderType;
import com.coin.exchanger.remote.response.*;
import com.coin.exchanger.remote.response.base.ResponseListWrapper;
import com.coin.exchanger.remote.response.base.ResponseWrapper;
import com.coin.exchanger.remote.service.RemoteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.util.UriComponentsBuilder;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BittrexClientApplicationTests {

	@Autowired
	private RemoteService remoteService;


	@Test
	public void testMarkets() {
		ResponseListWrapper<Market> markets =  remoteService.getMarketsRestCall();
		assertNotNull(markets);
		assertEquals(markets.getSuccess(),Boolean.TRUE);
		assertNotNull(markets.getResult());
		assertNotEquals(0,markets.getResult().size());
	}

	@Test
	public void testCurrencies() {
		ResponseListWrapper<Currency> currencies =  remoteService.getCurrenciesRestCall();
		assertNotNull(currencies);
		assertEquals(currencies.getSuccess(),Boolean.TRUE);
		assertNotNull(currencies.getResult());
		assertNotEquals(0,currencies.getResult().size());
	}

	@Test
	public void testTicker() {
		ResponseWrapper<Ticker> ticker =  remoteService.getTickerRestCall("BTC-LTC");
		assertNotNull(ticker);
		assertEquals(ticker.getSuccess(),Boolean.TRUE);
		assertNotNull(ticker.getResult());
	}

	@Test
	public void testMarketSummaries(){
		ResponseListWrapper<MarketSummary> marketSummaries = remoteService.getMarketSummariesRestCall();
		assertNotNull(marketSummaries);
		assertEquals(marketSummaries.getSuccess(),Boolean.TRUE);
		assertNotNull(marketSummaries.getResult());
		assertNotEquals(0,marketSummaries.getResult().size());
	}

	@Test
	public void testMarketSummary(){
		ResponseWrapper<MarketSummary> marketSummary = remoteService.getMarketSummaryRestCall("BTC-LTC");
		assertNotNull(marketSummary);
		assertEquals(marketSummary.getSuccess(),Boolean.TRUE);
		assertNotNull(marketSummary.getResult());
	}

	@Test
	public void testOrderBook(){
		//su an icin failll
		ResponseWrapper<OrderBook> orderBook = remoteService.getOrderBookRestCall("BTC-LTC",OrderType.BOTH);
		assertNotNull(orderBook);
		assertEquals(orderBook.getSuccess(),Boolean.TRUE);
		assertNotNull(orderBook.getResult());
		assertNotNull(orderBook.getResult().getBuy());
		assertNotNull(orderBook.getResult().getSell());
		assertNotEquals(0,orderBook.getResult().getBuy().size());
		assertNotEquals(0,orderBook.getResult().getSell().size());

		orderBook = remoteService.getOrderBookRestCall("BTC-LTC",OrderType.BUY);
		assertNotNull(orderBook);
		assertEquals(orderBook.getSuccess(),Boolean.TRUE);
		assertNotNull(orderBook.getResult());
		assertNotNull(orderBook.getResult().getBuy());
		assertNotEquals(0,orderBook.getResult().getBuy().size());
		assertNull(orderBook.getResult().getSell());

		orderBook = remoteService.getOrderBookRestCall("BTC-LTC",OrderType.SELL);
		assertNotNull(orderBook);
		assertEquals(orderBook.getSuccess(),Boolean.TRUE);
		assertNotNull(orderBook.getResult());
		assertNotNull(orderBook.getResult().getSell());
		assertNotEquals(0,orderBook.getResult().getSell().size());
		assertNull(orderBook.getResult().getBuy());

	}

	@Test
	public void testMarketHistory(){
		ResponseListWrapper<MarketSummary> marketSummaries = remoteService.getMarketSummariesRestCall();
		assertNotNull(marketSummaries);
		assertEquals(marketSummaries.getSuccess(),Boolean.TRUE);
		assertNotNull(marketSummaries.getResult());
		assertNotEquals(0,marketSummaries.getResult().size());
	}

}
