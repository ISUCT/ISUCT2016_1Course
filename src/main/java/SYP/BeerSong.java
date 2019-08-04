package SYP;

/**
 * Created by Maxim on 06-Jan-17.
 */
public class BeerSong {
    public static void main (String[] args){
        int beerNum = 99;
        String word = " бутылок (булытки)";

        while (beerNum > 0) {
            if (beerNum == 1) {
                word = " бутылочка"; // в ед. числе - ОДНА бутылочка
            }

            System.out.println(beerNum + "" + word + " пива на стене");
            System.out.println(beerNum + "" + word + " пива");
            System.out.println("Возьми одну");
            System.out.println("Пусти по кругу");
            beerNum = beerNum - 1;
        }

        System.out.println("Нет бутылок пива на стене");
    }
}

