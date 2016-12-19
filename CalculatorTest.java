import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by stud_6 on 19.12.16.
 */
public class CalculatorTest {
    @Test
    public void calc() throws Exception {
    Calculator calcul = new Calculator();
        double yReturn = calcul.calc(1.1,2.5);
        double yResult = 0.350;
        assertEquals(yResult,yReturn,0.001);
    }
    @Test
    public void calcArray() throws Exception{
        Double[] x = {1.1,2.2,3.3,4.4,5.5};
        ArrayList<Double> xZn = new ArrayList<Double>(Arrays.asList(x));
        int y = xZn.size();

    }
}