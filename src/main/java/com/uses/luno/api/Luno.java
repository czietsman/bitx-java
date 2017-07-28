package com.uses.luno.api;

public interface Luno {
    TickerOperations tickerOperations();

    OrderBookOperations orderBookOperations();

    TradeOperations tradeOperations();
}
