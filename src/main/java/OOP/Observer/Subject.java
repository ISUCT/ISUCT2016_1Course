package OOP.Observer;


/**
 * Created by UI on 11.10.2017.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
