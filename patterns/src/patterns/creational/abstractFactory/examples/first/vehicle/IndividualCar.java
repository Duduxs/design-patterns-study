package patterns.creational.abstractFactory.examples.first.vehicle;

import patterns.creational.abstractFactory.examples.first.customer.Customer;

public class IndividualCar implements Vehicle {

    public String carName;

    public Customer customer;

    public IndividualCar() {}

    public IndividualCar(String carName, Customer customer) {
        this.carName = carName;
        this.customer = customer;
    }

    @Override
    public void pickUp() {
        System.out.println(String.format("%s está buscando %s [INDIVIDUAL]", carName, customer.getName()));
    }
}
