package patterns.behavioural.strategy.examples.second.strategies;

public class Jadlog implements ShippingStrategyCalculator {

    private Float shipping = 90F;

    @Override
    public Float getTotalShippingValue(Float amount) {

        return amount - shipping;
    }
}
