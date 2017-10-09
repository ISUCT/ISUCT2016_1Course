package Duck;

/**
 * Created by UI on 09.10.2017.
 */
public class MiniDuckSimulator  {
    public static void main(String[] args){
        Duck mallar = new MallarDuck();
        mallar.perfomFly();
        mallar.perfomQuack();
        Duck model = new ModelDuck();
        model.perfomFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.perfomFly();
    }

}
