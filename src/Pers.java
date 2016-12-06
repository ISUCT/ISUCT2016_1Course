/**
 * Created by stud_6 on 22.11.16.
 */
public class Pers extends Cat implements Pets {
    void Talk(){System.out.println("Meowssss");

    }
    public Pers(){
        setColor("Yellow");
        setName("NoNamePers");
    }
    public Pers (String N, String C){
        setName(N);
        setColor(C);
    }
    @Override
    public void beFriendly() {

    }

    @Override
    public void play() {

    }

    @Override
    public void sleepInSoofa() {

    }
}
