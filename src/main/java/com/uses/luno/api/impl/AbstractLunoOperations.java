package com.uses.luno.api.impl;

import org.springframework.social.support.URIBuilder;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

abstract class AbstractLunoOperations {
    private static final String API_URL_BASE = "https://api.mybitx.com/api/1/";
    private static final LinkedMultiValueMap<String, String> EMPTY_PARAMETERS = new LinkedMultiValueMap<>();
    final RestTemplate restTemplate;

    AbstractLunoOperations(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    URI buildUri(String path) {
        return buildUri(path, EMPTY_PARAMETERS);
    }

    URI buildUri(String path, String parameterName, String parameterValue) {
        MultiValueMap<String, String> parameters = new LinkedMultiValueMap<>();
        parameters.set(parameterName, parameterValue);
        return buildUri(path, parameters);
    }

    URI buildUri(String path, MultiValueMap<String, String> parameters) {
        return URIBuilder.fromUri(API_URL_BASE + path).queryParams(parameters).build();
    }
}
