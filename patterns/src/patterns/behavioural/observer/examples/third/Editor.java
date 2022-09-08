package patterns.behavioural.observer.examples.third;

import java.io.File;

public class Editor {

    public BaseEventPublisherManager events;
    private File file;

    public Editor() {
        this.events = new BaseEventPublisherManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws Exception {
        if(this.file != null) {
            events.notify("save", file);
        } else {
            throw new Exception("Please open a file first");
        }

    }

}
