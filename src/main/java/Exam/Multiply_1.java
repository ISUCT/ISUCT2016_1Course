package Exam;

/**
 * Created by Maxim on 09-Jan-17.
 */
public class Multiply_1 {
    public void processM(int a, int b) {
        for (int i = 1; i <= a; i++) {
            for (int k = 1; k <= b; k++) {
                System.out.print(k * i + " ");
            }
            System.out.println("");
        }
    }
}
