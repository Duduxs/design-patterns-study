package patterns.creational.abstractFactory.factory;

import patterns.creational.abstractFactory.customer.Customer;
import patterns.creational.abstractFactory.customer.IndividualCustomer;
import patterns.creational.abstractFactory.vehicle.IndividualCar;
import patterns.creational.abstractFactory.vehicle.Vehicle;

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
