package patterns.creational.prototype.examples.first;

public class Address {

    private String name;

    private Integer number;

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

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
