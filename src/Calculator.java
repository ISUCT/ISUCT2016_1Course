import java.util.ArrayList;

/**
 * Created by Pavel on 13.12.2016.
 */
public class Calculator {

    public void calc(double a, double b){
        double c;
        double z;
        double y;
        a = Math.pow(a,3);
        b = Math.pow(b,3);
        c = a + b;
        c = Math.sin(c);
        c = Math.pow(c,2);
        c = c++;
        z = a + b;
        z = Math.pow(z,1.0/3.0);
        y = c/z;
        System.out.println(y);
        }
    public void calc(ArrayList<Double> xPer){
        for (int i = 0; i < 5; i++){
            double y;
            y = xPer.get(i);
            calc(y,2.5);
        }
    }
    }

