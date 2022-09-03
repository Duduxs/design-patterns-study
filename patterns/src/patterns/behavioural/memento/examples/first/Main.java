package patterns.behavioural.memento.examples.first;

public class Main {

    public static void main(String[] args) {

        var imageEditor = new ImageEditorOriginator("/media/image.png", "png");
        var backupManager = new ImageEditorBackupCaretaker(imageEditor);

        backupManager.backup();
        imageEditor.convertFormatTo("jpg");
        System.out.println(imageEditor + "\n");

        backupManager.restore();
        System.out.println(imageEditor + "\n");

        backupManager.restore();
        backupManager.restore();

        backupManager.backup();
        imageEditor.convertFormatTo("gif");

        backupManager.backup();
        imageEditor.convertFormatTo("bmp");

        backupManager.backup();
        imageEditor.convertFormatTo("tsz");

        backupManager.backup();
        imageEditor.convertFormatTo("png");

        backupManager.listAllMementos();

        System.out.println(imageEditor + "\n");
        backupManager.restore();
        System.out.println(imageEditor + "\n");
        backupManager.restore();
        System.out.println(imageEditor + "\n");
        backupManager.restore();
        System.out.println(imageEditor + "\n");
        backupManager.restore();
        System.out.println(imageEditor + "\n");
        backupManager.restore();
        System.out.println(imageEditor + "\n");

        backupManager.listAllMementos();

    }
}
