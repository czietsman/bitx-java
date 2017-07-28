package com.uses.luno.api.impl;

import com.uses.luno.api.Ticker;
import com.uses.luno.api.TickerOperations;
import com.uses.luno.api.Tickers;
import org.springframework.web.client.RestTemplate;

class TickerTemplate extends AbstractLunoOperations implements TickerOperations {
    TickerTemplate(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    public Ticker getTicker(String pair) {
        return restTemplate.getForObject(buildUri("ticker", "pair", pair), Ticker.class);
    }

    @Override
    public Tickers getAllTickers() {
        return restTemplate.getForObject(buildUri("tickers"), Tickers.class);
    }
}

