package patterns.creational.factory.examples.third;

public class CoinFactory {

    public static Coin createCoin(CoinType coinType) {
        return coinType.getConstructor().get();
    }

}
