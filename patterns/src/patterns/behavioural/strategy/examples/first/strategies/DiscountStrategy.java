package patterns.behavioural.strategy.examples.first.strategies;

import patterns.behavioural.strategy.examples.first.ShoppingCart;

public abstract class DiscountStrategy {

    protected Integer discount = 0;

    Integer getDiscount(ShoppingCart shoppingCart) {
        return shoppingCart.getSubTotal();
    }

}

