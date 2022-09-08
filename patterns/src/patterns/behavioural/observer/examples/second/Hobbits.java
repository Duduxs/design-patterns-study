package patterns.behavioural.observer.examples.second;

public class Hobbits implements WeatherObserver{
    @Override
    public void update(WeatherType weatherType) {
        System.out.println("The hobbits are facing " + weatherType.getDescription() + " weather now");
    }
}
