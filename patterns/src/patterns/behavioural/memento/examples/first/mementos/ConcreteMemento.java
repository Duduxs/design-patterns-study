package patterns.behavioural.memento.examples.first.mementos;

import java.time.LocalDate;

public class ConcreteMemento implements Memento {

    private String name;
    private LocalDate date;
    private String filePath;
    private String fileFormat;

    public ConcreteMemento(String name, LocalDate date, String filePath, String fileFormat) {
        this.name = name;
        this.date = date;
        this.filePath = filePath;
        this.fileFormat = fileFormat;
    }

    @Override
    public String getName() { return name; }

    @Override
    public LocalDate getDate() {
        return date;
    }

    public String getFilePath() { return filePath; }

    public String getFileFormat() { return fileFormat; }

}
