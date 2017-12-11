package com.coin.exchanger.market.summary.ticker;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Semih Beceren
 */
@Repository
public interface TickerRepository extends CrudRepository<Ticker, Long> {
}
