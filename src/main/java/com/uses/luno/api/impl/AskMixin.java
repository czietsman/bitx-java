package com.uses.luno.api.impl;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

abstract class AskMixin extends LunoObjectMixin {
    @JsonCreator
    AskMixin(
            @JsonProperty("volume") String volume,
            @JsonProperty("price") String price
    ) {
    }
}
