package patterns.behavioural.observer.examples.first.observers;

public class SecondObserver implements Observer {

    @Override
    public void update(Object... values) {
        System.out.println(this.getClass().getSimpleName() + " Second observer called");
    }
}
