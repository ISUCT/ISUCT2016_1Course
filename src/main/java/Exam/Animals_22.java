package Exam;

/**
 * Created by UI on 24.11.2016.
 */

public abstract class Animals_22 {
    String location;
    int boundaries;
    public void sleep(){
        System.out.println("Животное спит...");
    }
    public void roam(){
        System.out.println("Животное бродит...");
    }
    public abstract void makeNoise();
    public abstract void Eat();
}
