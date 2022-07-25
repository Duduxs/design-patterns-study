package patterns.creational.prototype.examples.first;

public class Product implements Cloneable {

    private String id;
    private Double price;
    private Address address;

    public Product(final String id, final Double price, final Address address) {
        this.id = id;
        this.price = price;
        this.address = address;
    }

    public void setId(String id) { this.id = id; }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setAddress(Address address) { this.address = address; }

    @Override
    public Product clone() {
        try {
            return (Product) super.clone();
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
