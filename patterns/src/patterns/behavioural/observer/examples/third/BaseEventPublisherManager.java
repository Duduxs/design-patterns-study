package patterns.behavioural.observer.examples.third;



import patterns.behavioural.observer.examples.third.listeners.EventListener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseEventPublisherManager {

    Map<String, List<EventListener>> listeners = new HashMap<>();

    public BaseEventPublisherManager(String ...operations) {

        for (var o : operations) {
            this.listeners.put(o, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener eventListener) {
        List<EventListener> users = this.listeners.get(eventType);
        users.add(eventListener);
    }

    public void unsubscribe(String eventType, EventListener eventListener) {
        List<EventListener> users = this.listeners.get(eventType);
        users.remove(eventListener);
    }

    public void notify(String eventType, File file) {
        List<EventListener> users = this.listeners.get(eventType);

        for(EventListener listener : users) {
            listener.update(eventType, file);
        }
    }

}
