package src;

import src.Duck;
import src.FlyRocketPowered;
import src.MallardDuck;

/**
 * Created by UI on 13.09.2017.
 */
public class MiniDuckSimulator {
    public static void main(String args[]){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}