package com.uses.luno.api;

public interface TickerOperations {
    Ticker getTicker(String pair);

    Tickers getAllTickers();
}


