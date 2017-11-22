package Decorator;

/**
 * Created by UI on 22.11.2017.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha (Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription90() + ", Mocha";
    }

    public double cost(){
        return .20 + beverage.cost();
    }
}
