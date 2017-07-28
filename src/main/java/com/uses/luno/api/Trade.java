package com.uses.luno.api;

public class Trade {
    private final String volume;
    private final long timestamp;
    private final String price;
    private final boolean buy;

    public Trade(String volume, long timestamp, String price, boolean buy) {
        this.volume = volume;
        this.timestamp = timestamp;
        this.price = price;
        this.buy = buy;
    }

    public String getVolume() {
        return volume;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getPrice() {
        return price;
    }

    public boolean isBuy() {
        return buy;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "volume='" + volume + '\'' +
                ", timestamp=" + timestamp +
                ", price='" + price + '\'' +
                ", buy=" + buy +
                '}';
    }
}
