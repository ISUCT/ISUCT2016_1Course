package Exam;

/**
 * Created by Maxim on 11-Jan-17.
 */
public class DuckSp_7 extends Duck_7 implements DuckInt1_7, DuckInt2_7 {
    public static void main(String[] args) {
        DuckSp_7 dusksp = new DuckSp_7();
        dusksp.swim();
        dusksp.fly();
        dusksp.quack();
        dusksp.display();
    }


    public void fly() {
        System.out.println("Я конкретная летящая утка!");
    }

    public void quack() {
        System.out.println("Я конкретно крякаю!");

    }

    @Override
    void display() {
        System.out.println("Display, я отображаюсь");
    }
}