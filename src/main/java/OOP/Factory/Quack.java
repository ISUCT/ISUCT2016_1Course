package OOP.Factory;

/**
 * Created by UI on 13.09.2017.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Квак");
    }
}
