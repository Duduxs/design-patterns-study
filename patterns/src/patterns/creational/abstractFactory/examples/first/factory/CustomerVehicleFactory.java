package patterns.creational.abstractFactory.examples.first.factory;

import patterns.creational.abstractFactory.examples.first.customer.Customer;
import patterns.creational.abstractFactory.examples.first.vehicle.Vehicle;

public interface CustomerVehicleFactory {

    Customer createCustomer(final String customerName);

    Vehicle createVehicle(final String vehicleName, final String customerName);
}
