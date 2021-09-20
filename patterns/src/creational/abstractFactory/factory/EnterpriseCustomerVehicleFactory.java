package creational.abstractFactory.factory;

import creational.abstractFactory.customer.EnterpriseCustomer;
import creational.abstractFactory.customer.IndividualCustomer;
import creational.abstractFactory.vehicle.EnterpriseCar;
import creational.abstractFactory.vehicle.IndividualCar;

public class EnterpriseCustomerVehicleFactory implements CustomerVehicleFactory {

    @Override
    public EnterpriseCustomer createCustomer(final String customerName) {
        return new EnterpriseCustomer(customerName);
    }

    @Override
    public EnterpriseCar createVehicle(final String vehicleName, final String customerName) {
        return new EnterpriseCar(vehicleName, this.createCustomer(customerName));
    }
}
