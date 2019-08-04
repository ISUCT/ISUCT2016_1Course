package Decorator;

/**
 * Created by UI on 22.11.2017.
 */
public class Espresso extends Beverage{
    public Espresso(){
        description = "Espresso";
    }

    public double cost(){
        return 1.99;
    }
}
