package Exam;

import java.util.ArrayList;

/**
 * Created by Maxim on 10-Jan-17.
 */

public class Table_6 {
    public Integer process(int x, int a, int b) {

        int d1=x-b;
        int d2=d1*a;
        int d3=1+d2;
        return d3;
    }

    public ArrayList<Integer> process(ArrayList<Integer> xVal) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (Integer elements : xVal) {
            Integer y = process(elements, 3, 2);
            arr.add(y);
        }
        return arr;
    }
}

