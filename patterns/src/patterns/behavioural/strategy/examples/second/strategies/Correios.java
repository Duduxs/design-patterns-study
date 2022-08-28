package patterns.behavioural.strategy.examples.second.strategies;

public class Correios implements ShippingStrategyCalculator {

    private Float shipping = 45F;

    @Override
    public Float getTotalShippingValue(Float amount) {

        return amount - shipping;
    }
}
