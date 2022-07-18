package patterns.creational.abstractFactory.vehicle;

import patterns.creational.abstractFactory.customer.Customer;

public class EnterpriseCar implements Vehicle {

    public String carName;

    public Customer customer;

    public EnterpriseCar() {}

    public EnterpriseCar(String carName, Customer customer) {
        this.carName = carName;
        this.customer = customer;
    }

    @Override
    public void pickUp() {
        System.out.println(String.format("%s está buscando %s [ENTERPRISE]", carName, customer.getName()));
    }
}
