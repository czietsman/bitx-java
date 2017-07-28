package com.uses.luno.api;

public class Ask {
    private final String volume;
    private final String price;

    public Ask(String volume, String price) {
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
        return "Ask{" +
                "volume='" + volume + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
