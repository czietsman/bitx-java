package com.uses.luno.api.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

abstract class BidMixin extends LunoObjectMixin {
    @JsonCreator
    BidMixin(
            @JsonProperty("volume") String volume,
            @JsonProperty("price") String price
    ) {
    }
}
