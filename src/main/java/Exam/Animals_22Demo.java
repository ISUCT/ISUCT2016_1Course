package Exam;

import java.util.ArrayList;

/**
 * Created by UI on 12.01.2017.
 */
public class Animals_22Demo {
    public static void main (String[] args) {
        ArrayList<Animals_22> animArr = new ArrayList<Animals_22>();
        Animals_22 lion1 = new Lion_22();
        Animals_22 lion2 = new Lion_22();
        Animals_22 wolf1 = new Wolf_22();
        Animals_22 wolf2 = new Wolf_22();
        Animals_22 wolf3 = new Wolf_22();
        animArr.add(lion1);
        animArr.add(lion2);
        animArr.add(wolf1);
        animArr.add(wolf2);
        animArr.add(wolf3);
//        Animals anim=animArr.get(0);
        for(int x=0; x < animArr.size(); x++){
            animArr.get(x).makeNoise();
//            animArr.get(x).toString();
        }
//        for(Animals a:animArr){
//            a.makeNoise();
//        }
    }
}

