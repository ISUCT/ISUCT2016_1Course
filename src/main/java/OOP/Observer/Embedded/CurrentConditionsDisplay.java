package OOP.Observer.Embedded;

/**
 * Created by UI on 23.10.2017.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Текущее состояние: " + temperature
            + " градусов по Фарингейту, " + humidity + "% влажности ");
    }

}
