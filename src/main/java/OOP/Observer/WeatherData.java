package OOP.Observer;

import java.util.ArrayList;
import java.util.Observer;

/**
 * Created by UI on 11.10.2017.
 */

/*
public class WeatherData implements Subject {
    private Arraylist observers;
    private float temperatre;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }
    public void registerObserver(Observer o){
        observers.add(o);
    }
    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if (i >= 0){
            observers.remove(i);
        }
    }
    public void notifyObservers(){
        for (int i = 0; i < observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }
    public void measurementChanged(){
        notifyObservers();
    }
    public void serMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
    */