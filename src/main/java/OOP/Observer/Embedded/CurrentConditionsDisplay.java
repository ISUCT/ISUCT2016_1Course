package OOP.Observer.Embedded;

import java.util.Observer;
import java.util.Observable;


/**
 * Created by UI on 23.10.2017.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg){
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display(){
        System.out.println("Текущее состояние: " + temperature
            + " градусов по Фарингейту, " + humidity + "% влажности ");
    }

}
