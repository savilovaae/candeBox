package com.company;

public class ChocolateCandy extends NewSweet {
    public ChocolateCandy() {
        super();
        setName("ChocolateCandy");
        setIsGlazed(false);
        setPrice(143);
        setWeight(121.14);
    }

    @Override
    public int getTimeToEatInMS() {
        return (int) (weight / 1.5);
    }
}
