package Duck;

/**
 * Created by UI on 09.10.2017.
 */
public class MallardDuck  extends Duck {
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
