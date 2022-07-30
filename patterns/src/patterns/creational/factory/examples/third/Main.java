package patterns.creational.factory.examples.third;




public class Main {

    public static void main(String[] args) {

        var coin = CoinFactory.createCoin(CoinType.GOLD);

        System.out.println("\nGOLD COIN");
        System.out.println(coin.getWeight());

        GoldCoin goldCoin = (GoldCoin) coin;

        System.out.println(goldCoin.getColor());

        var anotherCoin = CoinFactory.createCoin(CoinType.SILVER);

        System.out.println("\nSILVER COIN");
        System.out.println(anotherCoin.getWeight());

    }

}
