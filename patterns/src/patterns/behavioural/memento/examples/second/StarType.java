package patterns.behavioural.memento.examples.second;

public enum StarType {

    SUN("sun"),
    RED_GIANT("read giant"),
    WHITE_DWARF("white dwarf"),
    SUPERNOVA("supernova"),
    DEAD("dead star :(");

    private final String title;

    StarType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StarType{");
        sb.append("title='").append(title).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
