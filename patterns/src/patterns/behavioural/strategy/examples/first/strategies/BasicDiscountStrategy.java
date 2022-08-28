package patterns.behavioural.strategy.examples.first.strategies;

import patterns.behavioural.strategy.examples.first.ShoppingCart;

public class BasicDiscountStrategy extends DiscountStrategy {

    @Override
    public Integer getDiscount(ShoppingCart shoppingCart) {

        var total = shoppingCart.getSubTotal();

        if (total >= 25) {
            discount = 3;
        }

        total -= (total * discount) / 100;

        return total;


    }
}
