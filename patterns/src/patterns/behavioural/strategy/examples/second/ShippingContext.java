package patterns.behavioural.strategy.examples.second;

import patterns.behavioural.strategy.examples.second.strategies.ShippingStrategyCalculator;

public class ShippingContext {

    private ShippingStrategyCalculator shippingStrategy;

    public ShippingContext(ShippingStrategyCalculator shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    Float calculateShipping(Float amount) {
        return this.shippingStrategy.getTotalShippingValue(amount);
    }


    public void setShippingStrategy(ShippingStrategyCalculator shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }
}
