package patterns.creational.abstractFactory.second.factory;

import patterns.creational.abstractFactory.second.factory.customer.EnterpriseCustomer;
import patterns.creational.abstractFactory.second.factory.vehicle.EnterpriseCar;

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
