package Exam;

/**
 * Created by Maxim on 11-Jan-17.
 */
public class OneTwoThree_10 {
    public static void process(int x1, int x2, int x3) {
        System.out.print(x1 + " " + x2 + " " + x3 + " ");
        for (int i = 1; i <= 10; i++) {
            int newX3 = x3 + x2 + x1;
            x1 = x2;
            x2 = x3;
            x3 = newX3;
            System.out.print(newX3 + " ");
        }
    }
}
