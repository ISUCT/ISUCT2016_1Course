package Decorator;

public class StarbuzzCoffee {
    public static void main (String args[]){
        Beverage beverage = new Espresso();
        System.out.println(String.format("Ваша цена %s - $%2.2f", beverage.getDescription(),beverage.cost()));


        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(String.format("Ваша цена %s - $%2.2f", beverage.getDescription(),beverage2.cost()));

        Beverage beverage3 = new DarkRoast();
        beverage3 = new Mocha(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(String.format("Ваша цена %s - $%2.2f", beverage.getDescription(),beverage3.cost()));

    }
}