package com.uses.luno.api.impl;

import com.fasterxml.jackson.databind.module.SimpleModule;
import com.uses.luno.api.*;

/**
 * Jackson module for registering mixin annotations against Luno model classes.
 */
class LunoModule extends SimpleModule {
    LunoModule() {
        super("LunoModule");
    }

    @Override
    public void setupModule(SetupContext context) {
        context.setMixInAnnotations(Ticker.class, TickerMixin.class);
        context.setMixInAnnotations(Tickers.class, TickersMixin.class);
        context.setMixInAnnotations(Ask.class, AskMixin.class);
        context.setMixInAnnotations(Bid.class, BidMixin.class);
        context.setMixInAnnotations(OrderBook.class, OrderBookMixin.class);
        context.setMixInAnnotations(Trade.class, TradeMixin.class);
        context.setMixInAnnotations(Trades.class, TradesMixin.class);
    }
}


