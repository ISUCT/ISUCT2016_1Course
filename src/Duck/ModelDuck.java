package Duck;

/**
 * Created by UI on 25.09.2017.
 */
public class ModelDuck extends Duck {
@Override
    public void display(){System.out.println("model duck");}
public ModelDuck(){
    flyBehavior = new FlyNoway();
    quackbehavior = new Quack();
}

}
