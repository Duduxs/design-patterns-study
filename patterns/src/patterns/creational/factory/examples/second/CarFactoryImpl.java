package patterns.creational.factory.examples.second;

public class CarFactoryImpl implements VehicleFactory {

    @Override
    public Car createVehicle() {
        return this.createVehicle("");
    }

    @Override
    public Car createVehicle(String name) {
        return new Car(name);
    }
}
