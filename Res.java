import java.util.ArrayList;

/**
 * Created by stud_6 on 12.12.16.
 */
public class Res {

    public static void main(String[] strings){
        ArrayList<Double> xZn = new ArrayList<Double>();
        xZn.add(1.1);
        xZn.add(2.4);
        xZn.add(3.6);
        xZn.add(1.7);
        xZn.add(3.9);
        Calculator calcul = new Calculator();
        calcul.calc(xZn);
    }
}
