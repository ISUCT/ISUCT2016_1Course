package SYP.firstGame;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by stud_6 on 14.11.16.
 */
public class DotComTest {
    @Test
    public void checkYourself1() throws Exception {
        ArrayList<String> trueLocation = new ArrayList<String>();
        trueLocation.add("2");
        trueLocation.add("3");
        trueLocation.add("4");

        DotCom dotCom = new DotCom();
        String userGuess = "2";
        dotCom.setLocationCells(trueLocation);
        String result = dotCom.checkYourself(userGuess);
        String expResult = "Попал";
        assertEquals(expResult, result);

    }


    @Test
    public void checkYourself2() throws Exception {
        ArrayList<String> trueLocation = new ArrayList<String>();
        trueLocation.add("2");
        trueLocation.add("3");
        trueLocation.add("4");

        DotCom dotCom = new DotCom();
        String userGuess = "1";
        dotCom.setLocationCells(trueLocation);
        String result = dotCom.checkYourself(userGuess);
        String expResult = "Мимо";
        assertEquals(expResult, result);

    }

    @Test
    public void checkYourself3() throws Exception{
    ArrayList<String> trueLocation = new ArrayList<String>();
        trueLocation.add("2");
        trueLocation.add("3");
        trueLocation.add("4");



        DotCom dotCom = new DotCom();
        dotCom.setLocationCells(trueLocation);
        String result = dotCom.checkYourself("2");
        assertEquals("Попал", result);
        result = dotCom.checkYourself("3");
        assertEquals("Попал", result);
        result = dotCom.checkYourself("1");
        String expResult = "Мимо";
        assertEquals(expResult, result);
        result = dotCom.checkYourself("4");
        assertEquals("Потопил", result);

    }


    @Test
    public void checkYourself4() throws Exception

    {
        ArrayList<String> trueLocation = new ArrayList<String>();
        trueLocation.add("2");
        trueLocation.add("3");
        trueLocation.add("4");

        DotCom dotCom = new DotCom();
        dotCom.setLocationCells(trueLocation);
        String result = dotCom.checkYourself("2");
        assertEquals("Попал", result);
        result = dotCom.checkYourself("3");
        assertEquals("Попал", result);
        result = dotCom.checkYourself("4");
        String expResult = "Потопил";
        assertEquals(expResult, result);

    }

    @Test
    public void checkYourself5() throws Exception {

        ArrayList<String> trueLocation = new ArrayList<String>();
        trueLocation.add("2");
        trueLocation.add("2");
        trueLocation.add("2");

        DotCom dotCom = new DotCom();
        dotCom.setLocationCells(trueLocation);
        String result = dotCom.checkYourself("2");
        assertEquals("Попал", result);
        result = dotCom.checkYourself("3");
        assertEquals("Мимо", result);
        result = dotCom.checkYourself("4");
        assertEquals("Мимо", result);

    }


}