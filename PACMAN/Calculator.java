package PACMAN; /**
 * Created by jakeones on 22.05.2017.
 */

import java.util.ArrayList;

public class Calculator {

    public double calc(double x) {
        double a = (Math.log10(Math.pow(Math.sin(x),3) + Math.pow(Math.cos(x),3)));
        return a;
    }

    public ArrayList<Double> calc(double xn, double xk, double xd){
        ArrayList<Double> yRes = new ArrayList<Double>();
        for(double x = xn; x<= xk; x+=xd){
            double y = calc(x);
            yRes.add(y);
        }
        return yRes;
    }
}
