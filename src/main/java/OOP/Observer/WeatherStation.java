package OOP.Observer;

import com.sun.org.glassfish.external.statistics.Statistic;

/**
 * Created by UI on 23.10.2017.
 */
public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new ForecastDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.serMeasurements(80, 65, 30.4f);
        weatherData.serMeasurements(82, 70, 29.2f);
        weatherData.serMeasurements(78, 90, 29.2f);
    }
}
