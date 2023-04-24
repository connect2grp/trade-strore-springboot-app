package com.grp.connect.trade.store.service;

import com.grp.connect.trade.store.beans.Trade;
import com.grp.connect.trade.store.exception.InvalidTradeException;

/**
 *
 */
public interface TradeService {
    void addTrade(Trade trade) throws InvalidTradeException;
    Trade[] getTrades();
}
