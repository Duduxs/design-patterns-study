package patterns.creational.factory.examples.third;

public interface Coin {
    Float getWeight();
}

class GoldCoin implements Coin {

    private String color;
    private Float weight;

    public GoldCoin(){
        this.color = "YELLOW";
        this.weight = 10F;
    }

    public GoldCoin(Float weight) {
        this.color = "YELLOW";
        this.weight = weight;
    }

    public String getColor() { return color; }

    @Override
    public Float getWeight() { return weight; }
}

class SilverCoin implements Coin {

    @Override
    public Float getWeight() {
        return 5F;
    }
}