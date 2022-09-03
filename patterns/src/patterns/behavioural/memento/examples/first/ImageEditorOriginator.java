package patterns.behavioural.memento.examples.first;

import patterns.behavioural.memento.examples.first.mementos.ConcreteMemento;
import patterns.behavioural.memento.examples.first.mementos.Memento;

import java.time.LocalDate;

public class ImageEditorOriginator {

    private String filePath;
    private String fileFormat;

    public ImageEditorOriginator(String filePath, String fileFormat) {
        this.filePath = filePath;
        this.fileFormat = fileFormat;
    }

    public void convertFormatTo(String format) {
        this.fileFormat = format;
        this.filePath = this.filePath.substring(0, this.filePath.indexOf("."));
        this.filePath += "." + format;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ImageEditor{");
        sb.append("filePath='").append(filePath).append('\'');
        sb.append(", fileFormat='").append(fileFormat).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Memento save() {
        var date = LocalDate.now();
        return new ConcreteMemento("Backup " + date, date, filePath, fileFormat);
    }

    public void restore(Memento memento) {
        if(memento instanceof ConcreteMemento m) {
            this.fileFormat = m.getFileFormat();
            this.filePath = m.getFilePath();
        }
    }

}
