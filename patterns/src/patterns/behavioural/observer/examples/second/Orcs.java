package patterns.behavioural.observer.examples.second;

public class Orcs implements WeatherObserver{
    @Override
    public void update(WeatherType weatherType) {
        System.out.println("The orgs are facing " + weatherType.getDescription() + " weather now");
    }
}
