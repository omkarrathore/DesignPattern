package local.practice.WeatherStationObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observerList;
    private float temp, humidity, pressure;

    public WeatherData(){
        observerList = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObserver() {
        observerList.stream().forEach(o->o.update(this.temp,this.humidity,this.pressure));
    }

    public void setMeasurement(float temp, float humidity, float pressure){
        this.temp = temp; this.humidity = humidity; this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged(){
        notifyObserver();
    }
}
