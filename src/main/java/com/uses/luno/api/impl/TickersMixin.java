package com.uses.luno.api.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.uses.luno.api.Ticker;

import java.util.List;

abstract class TickersMixin extends LunoObjectMixin {
    @JsonCreator
    TickersMixin(@JsonProperty("tickers") List<Ticker> tickers) {
    }
}
