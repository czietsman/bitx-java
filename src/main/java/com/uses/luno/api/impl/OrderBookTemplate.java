package com.uses.luno.api.impl;

import com.uses.luno.api.OrderBook;
import com.uses.luno.api.OrderBookOperations;
import org.springframework.web.client.RestTemplate;

class OrderBookTemplate extends AbstractLunoOperations implements OrderBookOperations {
    OrderBookTemplate(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    public OrderBook getOrderBook(String pair) {
        return restTemplate.getForObject(buildUri("orderbook", "pair", pair), OrderBook.class);
    }
}
