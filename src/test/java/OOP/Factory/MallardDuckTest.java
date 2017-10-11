package OOP.Factory;

import OOP.Factory.*;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by Maxim on 26-Sep-17.
 */
public class MallardDuckTest{


    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);

    @Before
    public void setUp() throws Exception {
        System.setOut(ps);
    }


    @Test
    public void testMallardDisplay() throws Exception {
        Duck mallard = new MallardDuck();
        mallard.display();
        assertEquals("Я - утка кряква\r\n", baos.toString());
    }

    @Test
    public void testMallardQuack() throws Exception {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        assertEquals("Квак\r\n", baos.toString());
    }

    @Test
    public void testModelDuck() {
        Duck model = new ModelDuck();
        model.display();
        assertEquals("Я модель утки\r\n", baos.toString());
    }

    @Test
    public void testMallardFly() throws Exception {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        assertEquals("Я лечу!\r\n", baos.toString());
    }

    @Test
    public void testMallardChangeFly() throws Exception {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        assertEquals("Я лечу!\r\n", baos.toString());
        baos.reset();
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
        assertEquals("Я не могу летать\r\n", baos.toString());
    }
    @Test
    public void testMallardChangeQuack() throws Exception {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        assertEquals("Квак\r\n", baos.toString());
        baos.reset();
        mallard.setQuackBehavior(new MuteQuack());
        mallard.performQuack();
        assertEquals("<< Silence >>\r\n", baos.toString());

    }
}