package com.uses.luno.api.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

abstract class TradeMixin extends LunoObjectMixin {
    @JsonProperty("volume")
    private String volume;

    @JsonProperty("timestamp")
    private long timestamp;

    @JsonProperty("price")
    private String price;

    @JsonProperty("is_buy")
    private boolean buy;

    @JsonCreator
    TradeMixin(
            @JsonProperty("volume") String volume,
            @JsonProperty("timestamp") long timestamp,
            @JsonProperty("price") String price,
            @JsonProperty("is_buy") boolean buy
    ) {
    }
}
