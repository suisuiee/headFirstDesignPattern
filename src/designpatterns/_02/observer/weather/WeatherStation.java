package designpatterns._02.observer.weather;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
            new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay =
            new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay =
            new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
