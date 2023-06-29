package com.company;

public class Caramel extends NewSweet {
    public Caramel() {
        super();
        setName("Caramel");
        setIsGlazed(false);
        setPrice(121);
        setWeight(121.12);
    }

    @Override
    public int getTimeToEatInMS() {
        return (int) (weight / 3);
    }
}
