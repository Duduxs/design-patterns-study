package patterns.creational.abstractFactory.second.factory;

import patterns.creational.abstractFactory.second.factory.customer.Customer;
import patterns.creational.abstractFactory.second.factory.vehicle.Vehicle;

public interface CustomerVehicleFactory {

    Customer createCustomer(final String customerName);

    Vehicle createVehicle(final String vehicleName, final String customerName);
}
