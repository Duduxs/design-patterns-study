package patterns.behavioural.strategy.examples.second;

import patterns.behavioural.strategy.examples.second.strategies.Correios;
import patterns.behavioural.strategy.examples.second.strategies.Jadlog;

public class Main {

    public static void main(String[] args) {

        var shipping = new ShippingContext(new Correios());

        System.out.println(shipping.calculateShipping(100F));

        shipping.setShippingStrategy(new Jadlog());

        System.out.println(shipping.calculateShipping(100F));

    }

}
