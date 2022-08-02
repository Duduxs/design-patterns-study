package patterns.creational.abstractFactory.examples.first.customer;

public class EnterpriseCustomer implements Customer {

    private String name;

    public EnterpriseCustomer(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
