package Duck1;

/**
 * Created by UI on 09.10.2017.
 */
public class ModelDuck  extends Duck1 {
    public ModelDuck(){
        flyBehavior = new FlyNoWay() ;
        quackBehavior = new Quack();


    }

    public void display(){
        System.out.println("I'm a model duck");
    }
}
