package patterns.creational.prototype.examples.second;

public class Product implements Cloneable {

    private String id;
    private Double price;
    private Address address;

    public Product(final String id, final Double price, final Address address) {
        this.id = id;
        this.price = price;
        this.address = address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Product clone() {
        try {
            var clone = (Product) super.clone();
            clone.setAddress(address.clone());

            return clone;

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", address=" + address +
                '}';
    }
}
