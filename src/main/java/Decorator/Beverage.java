package Decorator;

/**
 * Created by UI on 22.11.2017.
 */
public abstract class Beverage {
    String description = "Unknow beverage";

    public String getDescription90(){
        return description;
    }

    public abstract double cost();
}
