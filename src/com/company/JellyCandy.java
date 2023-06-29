package com.company;

public class JellyCandy extends NewSweet {

    public JellyCandy() {
        super();
        setName("JellyCandy");
        setIsGlazed(false);
        setPrice(123);
        setWeight(765.8);
    }

    @Override
    public int getTimeToEatInMS() {
        return (int) (weight / 2);
    }
}
