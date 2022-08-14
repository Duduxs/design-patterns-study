package patterns.structural.decorator.examples.third.decorators;

import patterns.structural.decorator.examples.third.products.Product;

public abstract class ProductDecorator implements Product {

    private Product product;

    public ProductDecorator(Product product) {
        this.product = product;
    }

    @Override
    public String getName() {
        return product.getName();
    }

    @Override
    public Float getPrice() {
        return product.getPrice();
    }
}
