import com.company.DotCom;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by stud_6 on 14.11.16.
 */
public class DotComTest {
    @org.junit.Test
    public void checkYourself() throws Exception {
        ArrayList<String> trueResult = new ArrayList<String>();
        trueResult.add("4");
        trueResult.add("5");
        trueResult.add("6");
        DotCom dotCom = new DotCom();
        dotCom.setLocationCells(trueResult);
        String result = dotCom.checkYourself("4");
        String expResult = "Попал";
        result = dotCom.checkYourself("5");
        expResult = "Попал";

    }

}