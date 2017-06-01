import java.util.ArrayList;
/**
 * Created by stud_6 on 19.12.16.
 */
public class Calculator {
    public Double calc (double x) {
        return null;
    }

    public ArrayList<Double> calc (double xn, double xk, double xd, double a, double b) {
        ArrayList<Double> yRes = new ArrayList<Double>();
        for(double x = xn; x<= xk; x+=xd){
            double y = calc(x);
            yRes.add(y);
        }
        return yRes;
    }
}