package patterns.behavioural.observer.examples.first.observers;

public class FirstObserver implements Observer {

    @Override
    public void update(Object... values) {
        System.out.println(this.getClass().getSimpleName() + " First observer called");
    }
}
