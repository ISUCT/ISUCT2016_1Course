import java.util.Calendar;

/**
 * Created by UI on 25.09.2017.
 */
public class LifeTime {
    public static void main(String[] args) {

        Calendar yesterday = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        Calendar calendar = Calendar.getInstance();



        calendar.set(Calendar.YEAR, 1988);
        calendar.set(Calendar.MONTH, 8);
        calendar.set(Calendar.DATE, 6);
        calendar.set(Calendar.HOUR_OF_DAY, 6);
        calendar.set(Calendar.MINUTE, 40 );
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        calendar2.set(Calendar.YEAR, yesterday.get(Calendar.YEAR) - calendar.get(Calendar.YEAR));
        calendar2.set(Calendar.MONTH, yesterday.get(Calendar.MONTH) - calendar.get(Calendar.MONTH));
        calendar2.set(Calendar.DAY_OF_MONTH, yesterday.get(Calendar.DAY_OF_MONTH) - calendar.get(Calendar.DAY_OF_MONTH));
        calendar2.set(Calendar.HOUR_OF_DAY, yesterday.get(Calendar.HOUR_OF_DAY) - calendar.get(Calendar.HOUR_OF_DAY));
        calendar2.set(Calendar.MINUTE, yesterday.get(Calendar.MINUTE) - calendar.get(Calendar.MINUTE));
        calendar2.set(Calendar.SECOND, yesterday.get(Calendar.SECOND) - calendar.get(Calendar.SECOND));
        System.out.println("Мне исполнилось: " + calendar2.get(Calendar.YEAR) + " лет , " + calendar2.get(Calendar.MONTH) + " месяцев , " + calendar2.get(Calendar.DAY_OF_MONTH) + " дней , " + calendar2.get(Calendar.HOUR_OF_DAY) + " часов , " + calendar2.get(Calendar.MINUTE) + " минут , " + calendar2.get(Calendar.SECOND) + " секунд.");
    }

}
