package patterns.behavioural.strategy.examples.first.strategies;

import patterns.behavioural.strategy.examples.first.ShoppingCart;

public class DefaultDiscountStrategy extends DiscountStrategy {

    @Override
    Integer getDiscount(ShoppingCart shoppingCart) {

        var total = shoppingCart.getSubTotal();

        if (total >= 100 && total < 200) {
            discount = 10;
        } else if (total >= 200 && total < 300) {
            discount = 20;
        } else if (total >= 300) {
            discount = 30;
        }

        total -= (total * discount) / 100;

        return total;

    }
}
