package SYP.firstGame;

/**
 * Created by stud_6 on 14.11.16.
 */
import java.util.ArrayList;
public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput) {
        String result = "Мимо";
            int index = locationCells.indexOf(userInput);
            if (index >= 0) {
                locationCells.remove(index);

                if (locationCells.isEmpty()) {
                    result = "Потопил";
                    System.out.println("Ой, вы потопили " + name + "   :(");
                } else {
                result = "Попал";
                } //Конец if
                return result;
            } // Конец внешнего if

        return result;
    } // Конец метода
} // Конец класса

