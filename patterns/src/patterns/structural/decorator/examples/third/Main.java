package patterns.structural.decorator.examples.third;

import patterns.structural.decorator.examples.third.decorators.ProductStampDecorator;
import patterns.structural.decorator.examples.third.products.TShirtProduct;

public class Main {

    public static void main(String[] args) {

        var tShirt = new TShirtProduct();

        System.out.println("---");
        System.out.println(tShirt.getName());
        System.out.println(tShirt.getPrice());
        System.out.println();

        var tShirtDecorated = new ProductStampDecorator(tShirt);

        System.out.println("---");
        System.out.println(tShirtDecorated.getName());
        System.out.println(tShirtDecorated.getPrice());
        System.out.println();

    }

}
