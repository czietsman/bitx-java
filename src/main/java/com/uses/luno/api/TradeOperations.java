package com.uses.luno.api;

public interface TradeOperations {
    Trades getTrades(String pair);

    Trades getTrades(String pair, long since);
}
