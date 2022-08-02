package patterns.creational.abstractFactory.second.factory.customer;

public class IndividualCustomer implements Customer {

    private String name;

    public IndividualCustomer(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
