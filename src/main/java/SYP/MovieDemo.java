package SYP;

/**
 * Created by Maxim on 08-Jan-17.
 */
public class MovieDemo {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Как Прогореть на Акциях";
        one.genre = "Трагедия";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Потерянные в офисе";
        two.genre = "Комедия";
        two.rating = 5;
        Movie three = new Movie();
        three.title = "Байт-клуб";
        three.genre = "Трагедия, но в целом весёлая";
        three.rating = 127;
    }
}
