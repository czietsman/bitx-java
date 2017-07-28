package com.uses.luno.api.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.uses.luno.api.Trade;

import java.util.List;

abstract class TradesMixin extends LunoObjectMixin {
    @JsonCreator
    TradesMixin(@JsonProperty("trades") List<Trade> trades) {
    }
}
