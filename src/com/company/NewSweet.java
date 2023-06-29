package com.company;

public abstract class NewSweet {
    String name;
    int price;
    boolean isGlazed;
    double weight;

    public NewSweet() {
        this.name = "Unnamed sweet";
    }

    public NewSweet setName(String name) {
        this.name = name;
        return this;
    }

    public NewSweet setPrice(int price) {
        this.price = price;
        return this;
    }

    public NewSweet setIsGlazed(boolean isGlazed) {
        this.isGlazed = isGlazed;
        return this;
    }

    public NewSweet setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public abstract int getTimeToEatInMS();
}
