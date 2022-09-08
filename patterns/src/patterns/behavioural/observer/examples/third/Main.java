package patterns.behavioural.observer.examples.third;

import patterns.behavioural.observer.examples.third.listeners.EmailNotificationListener;
import patterns.behavioural.observer.examples.third.listeners.LogOpenListener;

public class Main {

    public static void main(String[] args) {
        var editor = new Editor();

        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("eduardo@hotmail.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
