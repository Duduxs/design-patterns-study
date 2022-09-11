package patterns.behavioural.observer.examples.first.observers;

import java.util.ArrayList;
import java.util.Collection;

public class ObservableImpl implements Observable {

    private Collection<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        this.observers.forEach(Observer::update);
    }
}
