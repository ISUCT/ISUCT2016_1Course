package SYP.Guess;

/**
 * Created by Maxim on 08-Jan-17.
 */
public class Player {
    int number = 0;
    public void guess () {
        number = (int) (Math.random() * 10);
        System.out.println("Думаю, что это число " + number);
    }
}
