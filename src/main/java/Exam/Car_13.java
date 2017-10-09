package Exam;

/**
 * Created by Maxim on 12-Jan-17.
 */
public class Car_13 {
    public void start(){
        System.out.println("Старт");
    }

    public void stop(){
        System.out.println("Стоп!");
    }

    public int drive(int howlong){
        int distance = howlong * 60;
        return distance;
    }
}
