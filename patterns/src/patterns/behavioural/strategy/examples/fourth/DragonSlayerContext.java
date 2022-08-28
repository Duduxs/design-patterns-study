package patterns.behavioural.strategy.examples.fourth;

import patterns.behavioural.strategy.examples.fourth.strategies.DragonSlayingStrategy;

public class DragonSlayerContext {

    private DragonSlayingStrategy strategy;

    public DragonSlayerContext(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }

    public void goToBattle() {
        strategy.execute();
    }

}
