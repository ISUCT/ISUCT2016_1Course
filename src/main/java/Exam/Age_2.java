package Exam;

/**
 * Created by Maxim on 09-Jan-17.
 */
public class Age_2 {
    public static void ii (int x) {
        if (x<3) {
            System.out.println("Совсем маленький ребёнок");
        } else {
            if (x < 12) {
                System.out.println("Школьник обыкновенный");
            } else {
                if (x < 21) {
                    System.out.println("Школьники и студенты младших");
                }
            }
        }
    }
}
