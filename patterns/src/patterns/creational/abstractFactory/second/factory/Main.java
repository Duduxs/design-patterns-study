package patterns.creational.abstractFactory.second.factory;

import patterns.creational.abstractFactory.second.factory.EnterpriseCustomerVehicleFactory;
import patterns.creational.abstractFactory.second.factory.IndividualCustomerVehicleFactory;

public class Main {

    public static void main(String[] args) {
        var enterpriseCustomerVehicleFactory = new EnterpriseCustomerVehicleFactory();
        var enterpriseVehicle = enterpriseCustomerVehicleFactory.createVehicle("Toyota", "Carlos");

        enterpriseVehicle.pickUp();

        var individualCustomerVehicleFactory = new IndividualCustomerVehicleFactory();
        var individualVehicle = individualCustomerVehicleFactory.createVehicle("Honda", "Eduardo");

        individualVehicle.pickUp();
    }
}
