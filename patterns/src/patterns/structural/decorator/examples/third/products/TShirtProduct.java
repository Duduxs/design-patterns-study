package patterns.structural.decorator.examples.third.products;

public class TShirtProduct implements Product {

    @Override
    public String getName() {
        return "T-Shirt";
    }

    @Override
    public Float getPrice() { return 49.9F; }
}
