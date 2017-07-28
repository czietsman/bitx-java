package com.uses.luno.api.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.uses.luno.api.Luno;
import com.uses.luno.api.OrderBookOperations;
import com.uses.luno.api.TickerOperations;
import com.uses.luno.api.TradeOperations;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class LunoTemplate implements Luno {
    private final RestTemplate restTemplate;
    private TickerTemplate tickerOperations;
    private OrderBookTemplate orderBookOperations;
    private TradesTemplate tradeOperations;

    public LunoTemplate() {
        this.restTemplate = createRestTemplate();
        initSubApis();
    }

    private void initSubApis() {
        this.tickerOperations = new TickerTemplate(restTemplate);
        this.orderBookOperations = new OrderBookTemplate(restTemplate);
        this.tradeOperations = new TradesTemplate(restTemplate);
    }

    @Override
    public TickerOperations tickerOperations() {
        return this.tickerOperations;
    }

    @Override
    public OrderBookOperations orderBookOperations() {
        return orderBookOperations;
    }

    @Override
    public TradeOperations tradeOperations() {
        return tradeOperations;
    }

    /**
     * Returns a list of {@link HttpMessageConverter}s to be used by the internal {@link RestTemplate}.
     * By default, this includes a {@link StringHttpMessageConverter}, and a {@link MappingJackson2HttpMessageConverter}.
     * Override this method to add additional message converters or to replace the default list of message converters.
     *
     * @return a list of {@link HttpMessageConverter}s to be used by the internal {@link RestTemplate}.
     */
    private List<HttpMessageConverter<?>> getMessageConverters() {
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        messageConverters.add(new StringHttpMessageConverter());
        messageConverters.add(getJsonMessageConverter());
        return messageConverters;
    }

    /**
     * Returns a {@link MappingJackson2HttpMessageConverter} to be used by the internal {@link RestTemplate}.
     * Override to customize the message converter (for example, to set a custom object mapper or supported media types).
     * To remove/replace this or any of the other message converters that are registered by default, override the getMessageConverters() method instead.
     *
     * @return a {@link MappingJackson2HttpMessageConverter} to be used by the internal {@link RestTemplate}.
     */
    private MappingJackson2HttpMessageConverter getJsonMessageConverter() {
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setObjectMapper(new ObjectMapper().registerModule(new LunoModule()));
        return converter;
    }

    private RestTemplate createRestTemplate() {
        final RestTemplate restTemplate = new RestTemplate();
        restTemplate.setMessageConverters(getMessageConverters());
        return restTemplate;
    }
}
