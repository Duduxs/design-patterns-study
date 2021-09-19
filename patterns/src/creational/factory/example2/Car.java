package creational.factory.example2;

public class Car implements Vehicle {

    private String name;

    public Car() {}

    public Car(String name) { this.name = name; }

    @Override
    public void pickup(String customerName) { System.out.println(this.name + " está buscando " + customerName); }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }


}
