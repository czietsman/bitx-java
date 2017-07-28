package com.uses.luno.api;

import java.util.Iterator;
import java.util.List;

public class Tickers extends LunoObject implements Iterable<Ticker> {
    private final List<Ticker> tickers;

    public Tickers(List<Ticker> tickers) {
        this.tickers = tickers;
    }

    public List<Ticker> getTickers() {
        return tickers;
    }

    @Override
    public Iterator<Ticker> iterator() {
        return tickers.iterator();
    }
}

