package patterns.structural.proxy.examples.second;

public class Wizard {

    private String name;

    public Wizard(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Wizard{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
