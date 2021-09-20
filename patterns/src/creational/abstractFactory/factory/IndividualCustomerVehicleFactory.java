package creational.abstractFactory.factory;

import creational.abstractFactory.customer.Customer;
import creational.abstractFactory.customer.IndividualCustomer;
import creational.abstractFactory.vehicle.IndividualCar;
import creational.abstractFactory.vehicle.Vehicle;

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
