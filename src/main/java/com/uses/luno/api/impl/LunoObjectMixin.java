package com.uses.luno.api.impl;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Annotated mixin to add Jackson annotations to LunoObject.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
abstract class LunoObjectMixin {

    @JsonAnySetter
    abstract void add(String key, Object value);

}
