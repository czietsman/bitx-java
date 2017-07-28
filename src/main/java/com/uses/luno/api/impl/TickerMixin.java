package com.uses.luno.api.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
abstract class TickerMixin extends LunoObjectMixin {
    @JsonProperty("timestamp")
    private long timestamp;
    @JsonProperty("bid")
    private String bid;
    @JsonProperty("ask")
    private String ask;
    @JsonProperty("last_trade")
    private String lastTrade;
    @JsonProperty("rolling_24_hour_volume")
    private String rolling24HourVolume;
    @JsonProperty("pair")
    private String pair;

    @JsonCreator
    TickerMixin(
            @JsonProperty("timestamp") long timestamp,
            @JsonProperty("bid") String bid,
            @JsonProperty("ask") String ask,
            @JsonProperty("last_trade") String lastTrade,
            @JsonProperty("rolling_24_hour_volume") String rolling24HourVolume,
            @JsonProperty("pair") String pair) {
    }
}
