package patterns.behavioural.observer.examples.third.listeners;

import java.io.File;

public interface EventListener {

    void update(String eventType, File file);

}
