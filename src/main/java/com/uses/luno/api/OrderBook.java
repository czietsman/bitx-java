package com.uses.luno.api;

import java.util.List;

public class OrderBook extends LunoObject {
    private final long timestamp;
    private final List<Bid> bids;
    private final List<Ask> asks;

    public OrderBook(long timestamp, List<Bid> bids, List<Ask> asks) {
        this.timestamp = timestamp;
        this.bids = bids;
        this.asks = asks;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public List<Bid> getBids() {
        return bids;
    }

    public List<Ask> getAsks() {
        return asks;
    }

    @Override
    public String toString() {
        return "OrderBook{" +
                "timestamp=" + timestamp +
                ", bids=" + bids +
                ", asks=" + asks +
                '}';
    }
}
