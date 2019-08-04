package SYP;

/**
 * Created by maxim on 11.02.17.
 */
public class MyAnimalsList {
    private Animals_mal[] animals = new Animals_mal[5];
    private int nextIndex = 0;

    public void add (Animals_mal a) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("Animal добавлен в ячейку " + nextIndex);
        }
    }



    private class Animals_mal {
    }
}
