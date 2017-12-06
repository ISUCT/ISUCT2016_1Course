package SYP;

/**
 * Created by Maxim on 08-Jan-17.
 */
public class DrumKitDemo {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        d.playTopHat();


        if (d.snare == true) {
            d.playSnare();
        }
    }
}

