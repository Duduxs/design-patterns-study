package patterns.creational.prototype;

public class Product {

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
        return new Product(this.id, this.price, this.address);
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
