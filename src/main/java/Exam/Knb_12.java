package Exam;

/**
 * Created by Maxim on 12-Jan-17.
 */
public class Knb_12 {
    public void met(int x, int y) {
        if (Math.abs(x - y) == 2) {
            if (x > y) {
                System.out.println("Победил первый игрок");
            } else {
                System.out.println("Победил второй игрок");
            }
        } else {
            if (x > y) {
                System.out.println("Победил второй игрок");
            } else {
                if (x == y) {
                    System.out.println("Ничья");
                } else {
                    System.out.println("Победил первый игрок");
                }
            }
        }
    }
}
