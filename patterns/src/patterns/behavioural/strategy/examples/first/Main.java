package patterns.behavioural.strategy.examples.first;

import patterns.behavioural.strategy.examples.first.strategies.BasicDiscountStrategy;
import patterns.behavioural.strategy.examples.first.strategies.DefaultDiscountStrategy;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        var products = List.of(
                new Product("Product 1 ", 50),
                new Product("Product 2", 50)
        );

        // Cart without discount strategy

        var cart = new ShoppingCart();

        cart.addProduct(products.get(0), products.get(1));

        System.out.println(cart.getSubTotal());
        System.out.println(cart.getTotalWithDiscount());

        // Cart with discount strategy
        System.out.println();

        var cartWithDiscount = new ShoppingCart();

        cartWithDiscount.setDiscountStrategy(new DefaultDiscountStrategy());

        cartWithDiscount.addProduct(products.get(0), products.get(1));

        System.out.println(cartWithDiscount.getSubTotal());
        System.out.println(cartWithDiscount.getTotalWithDiscount());

        // Cart with basic strategy
        System.out.println();

        var cartWithBasicDiscount = new ShoppingCart();

        cartWithBasicDiscount.setDiscountStrategy(new BasicDiscountStrategy());

        cartWithBasicDiscount.addProduct(products.get(0), products.get(1));

        System.out.println(cartWithBasicDiscount.getSubTotal());
        System.out.println(cartWithBasicDiscount.getTotalWithDiscount());


    }

}
