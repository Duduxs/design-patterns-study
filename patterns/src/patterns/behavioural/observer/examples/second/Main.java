package patterns.behavioural.observer.examples.second;

public class Main {

    public static void main(String[] args) {

        var weather = new Weather();

        weather.addObserver(new Orcs());
        weather.addObserver(new Hobbits());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();





    }


}
