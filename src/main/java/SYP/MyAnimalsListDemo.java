package SYP;

/**
 * Created by maxim on 11.02.17.
 */
public class MyAnimalsListDemo {
    public static void main (String[] args){
        MyAnimalsList list_mal = new MyAnimalsList();
        Dog_mal a = new Dog_mal();
        Cat_mal c = new Cat_mal();
        // list_mal.add(a); - не создаётся, т.к. нужно указывать расширяемый клас...
        // list_mal.add(с); - не создаётся, т.к. нужно указывать расширяемый клас...

    }

    private static class Dog_mal {
    }

    private static class Cat_mal {
    }
}
