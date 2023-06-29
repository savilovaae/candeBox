package com.company;

public class Marmalade extends JellyCandy {
    public Marmalade() {
        super();
        setName("MarmaladeBear");
        setIsGlazed(false);
        setPrice(114);
        setWeight(456.91);
    }

    @Override
    public int getTimeToEatInMS() {
        return (int) (weight / 0.5);
    }
}
