package Decorator;

/**
 * Created by UI on 22.11.2017.
 */
public abstract class Beverage {
    String description = "Unknown beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
