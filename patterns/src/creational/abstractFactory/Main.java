package creational.abstractFactory;

import creational.abstractFactory.factory.EnterpriseCustomerVehicleFactory;
import creational.abstractFactory.factory.IndividualCustomerVehicleFactory;

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
