package patterns.creational.abstractFactory.examples.first;

import patterns.creational.abstractFactory.examples.first.customer.Customer;
import patterns.creational.abstractFactory.examples.first.customer.IndividualCustomer;
import patterns.creational.abstractFactory.examples.first.vehicle.IndividualCar;
import patterns.creational.abstractFactory.examples.first.vehicle.Vehicle;

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
