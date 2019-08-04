package SYP;

/**
 * Created by Maxim on 08-Jan-17.
 */
public class PhraseCMatic {
    public static void main (String[] args) {
        String[] wordListOne = {"круглосуточный", "трёх-звенный", "взаимный", "фронтэнд", "динамичный"};
        String[] wordListTwo = {"уполномоченный", "трудный", "ориентированный", "фирменный", "сетевой"};
        String[] wordListThree = {"процесс", "талант", "подход", "обзор", "образец"};
        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;
        int rand1 = (int) (Math.random() * oneLenght);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght);
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("Всё, что нам нужно - это " + phrase);
    }
}
