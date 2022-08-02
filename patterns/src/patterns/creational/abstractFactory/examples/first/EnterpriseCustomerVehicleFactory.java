package patterns.creational.abstractFactory.examples.first;

import patterns.creational.abstractFactory.examples.first.customer.EnterpriseCustomer;
import patterns.creational.abstractFactory.examples.first.vehicle.EnterpriseCar;

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
