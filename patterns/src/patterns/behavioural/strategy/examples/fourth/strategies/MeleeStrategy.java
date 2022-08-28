package patterns.behavioural.strategy.examples.fourth.strategies;

public class MeleeStrategy implements DragonSlayingStrategy {

    @Override
    public void execute() {
        System.out.println("With your Excalibur you sever the dragon's head!");
    }
}
