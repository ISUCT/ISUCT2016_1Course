package OOP;

/**
 * Created by UI on 13.09.2017.
 */
public class ModelDuck extends Duck{
    public ModelDuck(){

        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    public void display(){
        System.out.println("Я модель утки");
    }
}
