package OOP;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by Maxim on 26-Sep-17.
 */
public class MallardDuckTest {

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);

    @Before
    public void setUp() throws Exception {
        System.setOut(ps);
    }

    @After
    public void tearDown() throws Exception {
        baos.reset();
    }

    @Test
    public void testMallardQuack() {
        Duck Mallard = new MallardDuck();
        Mallard.display();
        assertEquals("Я - утка кряква\r\n", baos.toString());


    }

    @Test
    public void testModelDuck() {
        Duck model = new ModelDuck();
        model.display();
        assertEquals("Я модель утки\r\n", baos.toString());
    }
}