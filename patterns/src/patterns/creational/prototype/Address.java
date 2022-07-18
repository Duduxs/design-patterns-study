package patterns.creational.prototype;

public class Address {

    private String name;

    private Integer number;

    public Address(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
