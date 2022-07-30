package patterns.creational.factory.examples.third;

import java.util.function.Supplier;

public enum CoinType {
    GOLD(GoldCoin::new),
    SILVER(SilverCoin::new);

    private final Supplier<Coin> constructor;

    CoinType(Supplier<Coin> constructor) {
        this.constructor = constructor;
    }

    public Supplier<Coin> getConstructor() {
        return constructor;
    }
}
