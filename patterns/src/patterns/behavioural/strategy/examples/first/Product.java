package patterns.behavioural.strategy.examples.first;

public class Product {

    String name;
    Integer price;

    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }
}

