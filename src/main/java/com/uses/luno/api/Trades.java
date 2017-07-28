package com.uses.luno.api;

import java.util.Iterator;
import java.util.List;

public class Trades extends LunoObject implements Iterable<Trade> {
    private final List<Trade> trades;

    public Trades(List<Trade> trades) {
        this.trades = trades;
    }

    public List<Trade> getTrades() {
        return trades;
    }

    @Override
    public Iterator<Trade> iterator() {
        return trades.iterator();
    }

    @Override
    public String toString() {
        return "Trades{" +
                "trades=" + trades +
                '}';
    }
}
