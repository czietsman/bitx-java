package com.uses.luno.api.impl;

import com.uses.luno.api.*;
import org.junit.Test;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class LunoTemplateTest {
    private static final String CURRENCY_PAIR = "XBTZAR";
    private Luno luno = new LunoTemplate();

    @Test
    public void allTickers() throws Exception {
        final Tickers tickers = luno.tickerOperations().getAllTickers();
        assertFalse(tickers.getTickers().isEmpty());
    }

    @Test
    public void currencyPairTicker() throws Exception {
        final Ticker ticker = luno.tickerOperations().getTicker(CURRENCY_PAIR);
        assertNotNull(ticker);
    }

    @Test
    public void currencyPairOrderBook() throws Exception {
        final OrderBook orderBook = luno.orderBookOperations().getOrderBook(CURRENCY_PAIR);
        assertNotNull(orderBook);
    }

    @Test
    public void currencyPairTrades() throws Exception {
        final Trades trades = luno.tradeOperations().getTrades(CURRENCY_PAIR);
        assertNotNull(trades);
    }

    @Test
    public void currencyPairTradesSince10DaysAgo() throws Exception {
        final Instant _10_days_ago = Instant.now().minus(10, ChronoUnit.DAYS);
        final Trades trades = luno.tradeOperations().getTrades(CURRENCY_PAIR, _10_days_ago.toEpochMilli());
        assertNotNull(trades);
    }
}