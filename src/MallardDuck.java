package src;

import src.Duck;
import src.FlyWithWings;

/**
 * Created by UI on 13.09.2017.
 */

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }

}



