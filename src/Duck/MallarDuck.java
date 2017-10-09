package Duck;

/**
 * Created by UI on 13.09.2017.
 */
public class MallarDuck extends Duck{
public MallarDuck(){
    flyBehavior = new  FlyWithWings();
    quackbehavior = new MuteQuack();
}
@Override
public void display(){
    System.out.println("I am real MallarDuck");
}
}
