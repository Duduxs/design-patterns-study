package patterns.behavioural.observer.examples.first;

import patterns.behavioural.observer.examples.first.observers.FirstObserver;
import patterns.behavioural.observer.examples.first.observers.ObservableImpl;
import patterns.behavioural.observer.examples.first.observers.SecondObserver;

public class Main {

    public static void main(String[] args) {
        var observer = new FirstObserver();
        var observer2 = new SecondObserver();

        var observable = new ObservableImpl();

        observable.subscribe(observer);
        observable.subscribe(observer2);
        observable.subscribe(new SecondObserver());

        observable.notifyAllObservers();

        System.out.println();

        observable.unsubscribe(observer2);

        observable.notifyAllObservers();


    }

}
