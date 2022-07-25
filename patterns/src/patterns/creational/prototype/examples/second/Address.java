package patterns.creational.prototype.examples.second;

public class Address implements Cloneable {

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

    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
