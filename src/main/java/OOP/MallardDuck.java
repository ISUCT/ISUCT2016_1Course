package OOP;

/**
 * Created by UI on 13.09.2017.
 */
public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("Я - утка кряква");
    }
}
