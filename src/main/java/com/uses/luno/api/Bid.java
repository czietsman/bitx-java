package com.uses.luno.api;

public class Bid {
    private final String volume;
    private final String price;

    public Bid(String volume, String price) {
        this.volume = volume;
        this.price = price;
    }

    public String getVolume() {
        return volume;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Bid{" +
                "volume='" + volume + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
