package OOP;

/**
 * Created by UI on 13.09.2017.
 */
public class ModelDuck extends Duck{
    public ModelDuck(){

        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("Я модель утки");
    }
}
