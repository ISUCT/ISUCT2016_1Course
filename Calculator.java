import java.util.ArrayList;

/**
 * Created by Pavel on 13.12.2016.
 */
public class Calculator {

    public Double calc(double x, double b){
        double c;
        double z;
        double y;
        x = Math.pow(x,3);
        b = Math.pow(b,3);
        c = x + b;
        c = Math.sin(c);
        c = Math.pow(c,2);
        c = c++;
        z = x + b;
        z = Math.pow(z,1.0/3.0);
        y = c/z;
        return y;
    }

    public ArrayList<Double> calc(ArrayList<Double> xPer){
        ArrayList<Double> yZn = new ArrayList<Double>();
        for (Double elem:xPer){
         Double y = calc(elem,2.5);
            yZn.add(y);
        }
        return yZn;
    }
    public ArrayList<Double> calc(double xn, double xk, double dx){
        ArrayList<Double> yZn = new ArrayList<Double>();
                for(double x = xn; x<= xk; x+=dx){
                    double y = calc(x,2.5);
                    yZn.add(y);
                }
                return yZn;
    }
}