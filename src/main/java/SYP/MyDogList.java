package SYP;

/**
 * Created by maxim on 11.02.17.
 */
public class MyDogList {
    private Dog_mdl[] dogs = new Dog_mdl[5];
    private int nextIndex = 0;

    public void add(Dog_mdl d){
        if (nextIndex < dogs.length){
            dogs[nextIndex] = d;
            System.out.println("Dog  добавлен в ячейку " + nextIndex);
            nextIndex++;
        }
    }





    private class Dog_mdl {
    }
}
