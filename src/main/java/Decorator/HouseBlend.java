package Decorator;

/**
 * Created by UI on 22.11.2017.
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "House Blend Coffee";
    }

    public double cost(){
        return .89;
    }
}
