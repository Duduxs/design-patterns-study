package patterns.creational.factory.example2;

public class BikeFactoryImpl implements VehicleFactory {

    @Override
    public Bike createVehicle() {
        return this.createVehicle("");
    }

    @Override
    public Bike createVehicle(String name) {
        return new Bike(name);
    }
}
