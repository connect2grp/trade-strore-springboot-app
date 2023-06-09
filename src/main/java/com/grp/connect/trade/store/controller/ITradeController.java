package com.grp.connect.trade.store.controller;

import com.grp.connect.trade.store.beans.Trade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface ITradeController {
    ResponseEntity<String> addTrade(@RequestBody Trade trade);
    ResponseEntity<Trade[]> getTrades();
}
