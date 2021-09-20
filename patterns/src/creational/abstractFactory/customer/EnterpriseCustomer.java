package creational.abstractFactory.customer;

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
