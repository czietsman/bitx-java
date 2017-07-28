package com.uses.luno.api;

public class Ticker extends LunoObject {
    private final long timestamp;
    private final String bid;
    private final String ask;
    private final String last_trade;
    private final String rolling_24_hour_volume;
    private final String pair;

    public Ticker(long timestamp, String bid, String ask, String last_trade, String rolling_24_hour_volume, String pair) {
        this.timestamp = timestamp;
        this.bid = bid;
        this.ask = ask;
        this.last_trade = last_trade;
        this.rolling_24_hour_volume = rolling_24_hour_volume;
        this.pair = pair;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getBid() {
        return bid;
    }

    public String getAsk() {
        return ask;
    }

    public String getLastTrade() {
        return last_trade;
    }

    public String getRolling24HourVolume() {
        return rolling_24_hour_volume;
    }

    public String getPair() {
        return pair;
    }

    @Override
    public String toString() {
        return "Ticker{" +
                "timestamp=" + timestamp +
                ", bid='" + bid + '\'' +
                ", ask='" + ask + '\'' +
                ", last_trade='" + last_trade + '\'' +
                ", rolling_24_hour_volume='" + rolling_24_hour_volume + '\'' +
                ", pair='" + pair + '\'' +
                '}';
    }
}
