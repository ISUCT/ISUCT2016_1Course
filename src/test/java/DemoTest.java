import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by stud_6 on 08.11.16.
 */
public class DemoTest {
    @Test
    public void summ0() throws Exception {
        Demo demo = new Demo();
        int result = demo.summInt(2,5);
        int expResult = 7;
        assertEquals(expResult, result);
    }

    @Test
    public void summ1() throws Exception {
        Demo demo = new Demo();
        int result = demo.summInt(-2,5);
        int expResult = 3;
        assertEquals(expResult, result);
    }

    @Test
    public void summ2() throws Exception {
        Demo demo = new Demo();
        int result = demo.summInt(2,-5);
        int expResult = -3;
        assertEquals(expResult, result);
    }

    @Test
    public void summ3() throws Exception {
        Demo demo = new Demo();
        int result = demo.summInt(-2,-5);
        int expResult = -7;
        assertEquals(expResult, result);
    }

/*    @Test
    public void summ4() throws Exception {
        Demo demo = new Demo();
        int result = demo.summ(2147483647,2147483647);
        int expResult = (int)4294967294???;
        assertEquals(expResult, result);
    }
*/

    @Test
    public void summ5() throws Exception {
        Demo demo = new Demo();
        long result = demo.summLong(2147483647,2147483647);
        long expResult = 4294967294L;
        assertEquals(expResult, result);
    }


}

