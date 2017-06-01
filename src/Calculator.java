import java.util.ArrayList;
/**
 * Created by stud_6 on 19.12.16.
 */
public class Calculator {
    public Double calc(double x) {

        double d1 = Math.asin(x);
        double d2 = Math.pow(d1, 4.0);
        double d3 = Math.acos(x);
        double d4 = Math.pow(d3, 6.0);

        double d5 = d2+d4;
        double d6 = Math.pow(d5, 1.0/7.0);
        return d6;
    }

    public ArrayList<Double> calc(double xn, double xk, double dx){
        ArrayList<Double> yRes = new ArrayList<Double>();
        for(double x = xn; x<= xk; x+=dx){
            double y = calc(x);
            yRes.add(y);
        }
        return yRes;
    }
}