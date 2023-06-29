package com.company;

public class Main {
    /* Реализовать коробку со сладостями. В нее можно класть сладости, для каждой сладости указав вес,
    цену за 100 грамм и какие-либо другие свойства на свое усмотрение.
    Так же можно запросить информацию о общем весе, цене и вывести список сладостей в коробке.
    */

    public static void main(String[] args) {
        CandyBox newCB = new CandyBox();
        newCB.addCandy(new Caramel());
        newCB.addCandy(new Marmalade());
        newCB.addCandy(new JellyCandy());
        newCB.addCandy(new ChocolateCandy());
        newCB.addCandy(new ChocolateCandy());
        newCB.addCandy(new JellyCandy().setWeight(12342.232));
        System.out.println(String.format("price: %d \nweight: %.2f \nnames: %s ",
                newCB.getPrice(), newCB.getWeight(), newCB.getNames()));
        System.out.println("\n");
        newCB.deleteCandy(2);
        System.out.println(String.format("price: %d \nweight: %.2f \nnames: %s",
                newCB.getPrice(), newCB.getWeight(), newCB.getNames()));
    }
}
