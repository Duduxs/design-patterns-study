package patterns.creational.abstractFactory.factory;

import patterns.creational.abstractFactory.customer.Customer;
import patterns.creational.abstractFactory.vehicle.Vehicle;

public interface CustomerVehicleFactory {

    Customer createCustomer(final String customerName);

    Vehicle createVehicle(final String vehicleName, final String customerName);
}
