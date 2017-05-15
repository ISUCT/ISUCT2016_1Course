package Calculator;

import java.util.ArrayList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by stud_6 on 12.12.16.
 */
public class Calculator {

    public Double equ1(double x) {

        double d1 = Math.pow(x, 2);
        double d2 = d1 - 2.5;
        double d3 = Math.abs(d2);
        double d4 = Math.pow(d3, 1.0 / 4.0);

        double d5 = Math.log10(d1);
        double d6 = Math.pow(d5, 1.0 / 3.0);

        double d7 = d4 + d6;
        return d7;

    }

    public ArrayList<Double> equ1(ArrayList<Double> xVal) {
        ArrayList<Double> yRes = new ArrayList<Double>();
        for (Double eq1elements : xVal) {
            Double y = equ1(eq1elements);
            yRes.add(y);
        }
        return yRes;
    }

    public ArrayList<Double> equ1(double xn, double xk, double dx){
        ArrayList<Double> yRes = new ArrayList<Double>();
        for(double x = xn; x<= xk; x+=dx){
            double y = equ1(x);
            yRes.add(y);
        }
        return yRes;
    }
}