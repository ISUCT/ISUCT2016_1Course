package Exam;

/**
 * Created by Maxim on 12-Jan-17.
 */
public class LengthConverter_15 {
    public double convertet(double a, String lg) {
        double b = 0;
        if (lg == "Km") {
            b = a * 1.609;
        } else if (lg == "Ml") {
            b = a * 0.621;
        }
        return b;
    }
}


