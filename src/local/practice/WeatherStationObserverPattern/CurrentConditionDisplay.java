package local.practice.WeatherStationObserverPattern;


public class CurrentConditionDisplay implements Observer,DisplayElement{
    private float temp, humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData wd){
        this.weatherData = wd;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temp + " F degree and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.temp= temp;
        display();
    }
}
