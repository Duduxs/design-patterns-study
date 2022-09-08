package patterns.behavioural.observer.examples.first.observers;

public interface Observable {

    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyAllObservers();

}
