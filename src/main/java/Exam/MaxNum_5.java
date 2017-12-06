package Exam;

/**
 * Created by Maxim on 10-Jan-17.
 */
public class MaxNum_5 {
    public void process(int[] array){
        int[] arr1 = array;
        int max = 0;
        int prevMax = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(max<=arr1[i]){
                prevMax=max;
                max=arr1[i];
            }else{
                prevMax=arr1[i];
            }
        }
        int y = max * prevMax;
        System.out.println("Максимальное произведение = " + y);
        System.out.println("Числа макс. значения: " + max + " и " + prevMax);
    }
}

