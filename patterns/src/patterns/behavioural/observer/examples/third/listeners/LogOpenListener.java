package patterns.behavioural.observer.examples.third.listeners;

import java.io.File;

public class LogOpenListener implements EventListener {

    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + this.log + ": Someone has performed: " + eventType + " operation with the following file " + file.getName());
    }
}
