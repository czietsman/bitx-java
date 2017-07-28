package com.uses.luno.api.impl;

import com.uses.luno.api.TradeOperations;
import com.uses.luno.api.Trades;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

class TradesTemplate extends AbstractLunoOperations implements TradeOperations {
    TradesTemplate(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    public Trades getTrades(String pair) {
        return restTemplate.getForObject(buildUri("trades", "pair", pair), Trades.class);
    }

    @Override
    public Trades getTrades(String pair, long since) {
        MultiValueMap<String, String> data = new LinkedMultiValueMap<>();
        data.add("pair", pair);
        data.add("since", Long.toString(since));
        return restTemplate.getForObject(buildUri("trades", data), Trades.class);
    }
}

