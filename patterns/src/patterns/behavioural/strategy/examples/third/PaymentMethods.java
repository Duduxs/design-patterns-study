package patterns.behavioural.strategy.examples.third;

import patterns.behavioural.strategy.examples.third.strategies.PayByCreditCard;
import patterns.behavioural.strategy.examples.third.strategies.PayByPayPal;
import patterns.behavioural.strategy.examples.third.strategies.PayStrategy;

import java.util.Arrays;
import java.util.function.Supplier;

public enum PaymentMethods {

    CARD("1", PayByPayPal::new),
    PAYPAL("2", PayByCreditCard::new);

    private final String key;
    private final Supplier<PayStrategy> constructor;

    PaymentMethods(
            String key,
            Supplier<PayStrategy> constructor
    ) {
        this.key = key;
        this.constructor = constructor;
    }

    public String getKey() { return key; }

    public Supplier<PayStrategy> getConstructor() {
        return constructor;
    }

    public static PaymentMethods getByKey(String key) {
        return Arrays.stream(PaymentMethods.values())
                .filter(v -> v.getKey().equals(key))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }


}
