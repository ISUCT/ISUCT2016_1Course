package SYP;
/**
 * Created by Maxim on 10-Jan-17.
 */
class Dog2 {
    String name;
    public static void main (String[] args) {
        Dog2 dog2 = new Dog2();
        dog2.bark();
        dog2.name = "Барт";
        Dog2[] myDogs = new Dog2[3];
        myDogs[0] = new Dog2();
        myDogs[1] = new Dog2();
        myDogs[2] = dog2;
        myDogs[0].name = "Фред";
        myDogs[1].name = "Джордж";
        System.out.print("Имя последней собаки - ");
        System.out.println(myDogs[2].name);
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }
    public void bark(){
        System.out.println(name + " сказал Гав!");
    }
    public void eat(){}
    public void chaseCat(){}

}

