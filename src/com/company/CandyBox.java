package com.company;
import java.util.ArrayList;
import java.util.List;

public class CandyBox {
    private final List<NewSweet> candies;

    public CandyBox() {
        candies = new ArrayList<NewSweet>(); //массив переменной длины, по индексу
    }

    public void addCandy(NewSweet sweet) {
        candies.add(sweet);
    }

    public void deleteCandy(NewSweet sweet) {
        candies.remove(sweet);
    }

    public void deleteCandy(int index) {
        candies.remove(candies.get(index));
    }

    public double getWeight() {
        double totalWeight = 0;
        for (int i = 0; i < candies.size(); i++) {
            totalWeight += candies.get(i).weight;
        }
        return totalWeight;
    }

    public int getPrice() {
        int totalPrice = 0;
        for (int i = 0; i < candies.size(); i++) {
            totalPrice += candies.get(i).price;
        }
        return totalPrice;
    }

    public String getNames() { // string buider
        StringBuilder names = new StringBuilder("");
        for (int i = 0; i < candies.size(); i++) {
            names.append(candies.get(i).name).append(" ");
        }
        return names.toString();
    }
}
