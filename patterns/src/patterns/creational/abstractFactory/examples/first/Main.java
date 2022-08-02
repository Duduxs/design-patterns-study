package patterns.creational.abstractFactory.examples.first;

public class Main {

    public static void main(String[] args) {

        var enterpriseFactory = new EnterpriseCustomerVehicleFactory();
        var enterpriseVehicle = enterpriseFactory.createVehicle("Toyota", "Carlos");

        enterpriseVehicle.pickUp();

        var individualFactory = new IndividualCustomerVehicleFactory();
        var individualVehicle = individualFactory.createVehicle("Honda", "Eduardo");

        individualVehicle.pickUp();

    }
}
