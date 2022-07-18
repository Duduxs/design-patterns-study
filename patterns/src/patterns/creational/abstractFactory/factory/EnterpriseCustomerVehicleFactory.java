package patterns.creational.abstractFactory.factory;

import patterns.creational.abstractFactory.customer.EnterpriseCustomer;
import patterns.creational.abstractFactory.vehicle.EnterpriseCar;

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
