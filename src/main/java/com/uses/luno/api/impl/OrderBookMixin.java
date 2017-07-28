package com.uses.luno.api.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.uses.luno.api.Ask;
import com.uses.luno.api.Bid;

import java.util.List;

abstract class OrderBookMixin extends LunoObjectMixin {
    @JsonCreator
    OrderBookMixin(
            @JsonProperty("timestamp") long timestamp,
            @JsonProperty("bids") List<Bid> bids,
            @JsonProperty("asks") List<Ask> asks
    ) {
    }
}

