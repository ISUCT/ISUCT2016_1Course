import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by stud_6 on 06.12.16.
 */
public class PersConstrucorTest {
    @Test
   public void NoChanges() throws Exception{
        Pers test = new Pers();
        String TestName="NoNamePers";
        String TestColor="Yellow";
        String ResultColor=test.getColor();
        String ResultName=test.getName();
        assertEquals(ResultColor, TestColor);
        assertEquals(TestName, ResultName);

    }
    @Test
    public void Changes() throws Exception{
        Pers test = new Pers("A","B");
        String TestName="A";
        String TestColor="B";
        String ResultColor=test.getColor();
        String ResultName=test.getName();
        assertEquals(ResultColor, TestColor);
        assertEquals(TestName, ResultName);

    }

}