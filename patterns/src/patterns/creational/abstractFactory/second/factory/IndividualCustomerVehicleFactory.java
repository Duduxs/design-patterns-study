package patterns.creational.abstractFactory.second.factory;

import patterns.creational.abstractFactory.second.factory.customer.Customer;
import patterns.creational.abstractFactory.second.factory.customer.IndividualCustomer;
import patterns.creational.abstractFactory.second.factory.vehicle.IndividualCar;
import patterns.creational.abstractFactory.second.factory.vehicle.Vehicle;

public class IndividualCustomerVehicleFactory implements CustomerVehicleFactory {

    @Override
    public Customer createCustomer(String customerName) {
        return new IndividualCustomer(customerName);
    }

    @Override
    public Vehicle createVehicle(String vehicleName, String customerName) {
        return new IndividualCar(vehicleName, this.createCustomer(customerName));
    }
}
