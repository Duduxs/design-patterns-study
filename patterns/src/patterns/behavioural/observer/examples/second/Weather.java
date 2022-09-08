package patterns.behavioural.observer.examples.second;

import java.util.ArrayList;
import java.util.Collection;

import static patterns.behavioural.observer.examples.second.WeatherType.SUNNY;

public class Weather {

    private WeatherType currentWeather;
    private final Collection<WeatherObserver> observers;

    public Weather() {
        this.currentWeather = SUNNY;
        this.observers = new ArrayList<>();
    }

    public void addObserver(WeatherObserver observer) {
        this.observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        this.observers.remove(observer);
    }

    public void timePasses() {
        var enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        System.out.println("The weather changed to " + currentWeather);
        notifyObservers();
    }

    public void notifyObservers() {
        this.observers.forEach(o -> o.update(currentWeather));
    }



}
