package local.practice.WeatherStationObserverPattern;


public class Main {
    public static void main(String[] args) {
        WeatherData weatherData  = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurement(19.2f,30.12f,100.23f);
        weatherData.setMeasurement(20.2f,15.12f,104.23f);
        weatherData.setMeasurement(25.2f,20.12f,120.23f);
    }
}
