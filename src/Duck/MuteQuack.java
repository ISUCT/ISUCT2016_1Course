package Duck;

/**
 * Created by UI on 09.10.2017.
 */
public class MuteQuack implements Quackbehavior {
    @Override
    public void quack(){System.out.print("<<Silence>>");}
}
