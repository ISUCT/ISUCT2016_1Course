import Calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Maxim on 09-Jan-17.
 */
public class CalculatorTest {
    @Test
    public void equ1() throws Exception {
        Calculator calcRes = new Calculator();
        double result = calcRes.equ1(1.25);
        double expResult = 1.5627;
        assertEquals(expResult, result, 0.001);
    }
}