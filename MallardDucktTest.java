import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MallardDuckTest {

        public MallardDuckTest() throws Exception {
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);

        @Before
        public void setUp() throws Exception {
            System.setOut(ps);
        }

        @Test
        public void testMallardQuack() throws Exception {
            Duck mallard = new MallardDuck();
            mallard.performQuack();
            assertEquals("Quack\r\n", baos.toString());


        }
        @Test
         public void testModelDuck() throws Exception {
            Duck model = new ModelDuck();
            model.display();
            assertEquals("I'm a model duck\r\n", baos.toString());
        }
        @Test
         public void testMallardFly() throws Exception {
            Duck mallard = new MallardDuck();
            mallard.performFly();
            assertEquals("I'm flying!!\r\n", baos.toString());
        }
    @Test
    public void testMallardChangeFly() throws Exception {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        assertEquals("I'm flying!!\r\n", baos.toString());
        baos.reset();
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
        assertEquals("I can't fly\r\n", baos.toString());
    }
    @Test
    public void testMallardChangeQuack() throws Exception {
            Duck mallard = new MallardDuck();
            mallard.performQuack();
            assertEquals("Quack\r\n", baos.toString());
            baos.reset();
            mallard.setQuackBehavior(new MuteQuack());
            mallard.performQuack();
            assertEquals("<< Silence >>\r\n", baos.toString());

    }


}
