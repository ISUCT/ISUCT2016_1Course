package Exam;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Maxim on 10-Jan-17.
 */
public class Table_6Demo {
    public static void main(String [] strings){
        Integer [] tmp = new  Integer[10];
        for (Integer i = 0; i < 10; i++){
            tmp[i] = i+1;
        }

        ArrayList<Integer> demoArr =  new ArrayList<Integer>(Arrays.<Integer>asList(tmp));
        Table_6 demoDec = new Table_6();
        demoArr = demoDec.process(demoArr);
        System.out.println(demoArr);
    }
}
