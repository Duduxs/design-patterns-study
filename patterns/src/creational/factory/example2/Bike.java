package creational.factory.example2;

public class Bike implements Vehicle {

    private String name;

    public Bike() {}

    public Bike(String name) { this.name = name; }

    @Override
    public void pickup(String customerName) { System.out.println(this.name + " está buscando " + customerName); }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                '}';
    }
}
