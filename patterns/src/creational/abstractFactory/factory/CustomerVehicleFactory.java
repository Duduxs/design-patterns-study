package creational.abstractFactory.factory;

import creational.abstractFactory.customer.Customer;
import creational.abstractFactory.vehicle.Vehicle;

public interface CustomerVehicleFactory {

    Customer createCustomer(final String customerName);

    Vehicle createVehicle(final String vehicleName, final String customerName);
}
