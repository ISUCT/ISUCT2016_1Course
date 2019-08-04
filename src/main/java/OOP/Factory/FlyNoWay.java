package OOP.Factory;

/**
 * Created by UI on 13.09.2017.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Я не могу летать");
    }
}
