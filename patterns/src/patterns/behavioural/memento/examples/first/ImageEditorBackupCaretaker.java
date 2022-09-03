package patterns.behavioural.memento.examples.first;

import patterns.behavioural.memento.examples.first.mementos.Memento;

import java.util.Stack;

public class ImageEditorBackupCaretaker {

    private ImageEditorOriginator imageEditorOriginator;
    private Stack<Memento> mementos = new Stack<>();

    public ImageEditorBackupCaretaker(ImageEditorOriginator imageEditorOriginator) {
        this.imageEditorOriginator = imageEditorOriginator;
    }

    public void backup() {
        System.out.println("Backup: Saving Image editor state");
        var memento = mementos.push(imageEditorOriginator.save());
        System.out.println("Backup: Done! Memento name: " + memento.getName() + "\n");
    }

    public void restore() {

        if(mementos.isEmpty())  {
            System.out.println("Restore: Nothing to backup");
            return;
        }

        System.out.println("Restore: Saving Image editor state");


        var memento = mementos.pop();
        imageEditorOriginator.restore(memento);

        System.out.println("Restore: Done! Memento name: " + memento.getName() + "\n");
    }

    public void listAllMementos() {
        mementos.forEach(System.out::println);
    }

}
