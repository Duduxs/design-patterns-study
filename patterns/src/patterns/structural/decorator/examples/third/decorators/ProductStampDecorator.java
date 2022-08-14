package patterns.structural.decorator.examples.third.decorators;

import patterns.structural.decorator.examples.third.products.Product;

public class ProductStampDecorator extends ProductDecorator {

    public ProductStampDecorator(Product product) {
        super(product);
    }

    @Override
    public String getName() { return super.getName() + " with stamp"; }

    @Override
    public Float getPrice() { return super.getPrice() + 10F; }
}
