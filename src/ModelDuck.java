package src;

import src.Duck;
import src.FlyNoWay;

/**
 * Created by UI on 25.09.2017.
 */
public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();


    }

    public void display(){
        System.out.println("I'm a model duck");
    }
}