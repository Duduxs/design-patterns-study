package patterns.creational.factory.examples.second;

public interface VehicleFactory {

    Vehicle createVehicle();

    Vehicle createVehicle(final String name);

    default void pickup(final String vehicleName, final String customerName) {
        final Vehicle vehicle = this.createVehicle(vehicleName);
        vehicle.pickup(customerName);
    }
}
