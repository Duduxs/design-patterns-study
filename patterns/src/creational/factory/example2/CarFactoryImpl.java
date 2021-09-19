package creational.factory.example2;

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
