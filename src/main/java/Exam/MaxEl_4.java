package Exam;

/**
 * Created by Maxim on 09-Jan-17.
 */

public class MaxEl_4 {
    public void smi(int[] array){
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[maxIndex] < array[i]) {
                maxIndex = i;
            }
        }
        System.out.println(array[maxIndex]);
        System.out.println(maxIndex);
    }
}


/*
public class MaxEl_4 {
    public void smi(int [] search){


        int maxIndex = 0;
        for (int i = 0; i < search.length; i++) {
            if (search[maxIndex] < search[i]) {
                maxIndex = i;
            }
        }
        System.out.println(search[maxIndex]);
        System.out.println(maxIndex);
    }
}

*/



        /*

        V2


        int[] search;
        search = new int[5];
        search[0] = 21;
        search[1] = 223;
        search[2] = 32;
        search[3] = 256;
        search[4] = 244;


        int maxIndex = 0;
        for (int i = 0; i < search.length; i++) {
            if (search[maxIndex] < search[i]) {
                maxIndex = i;
            }
        }
        System.out.println(search[maxIndex]);
        System.out.println(maxIndex);


         */



