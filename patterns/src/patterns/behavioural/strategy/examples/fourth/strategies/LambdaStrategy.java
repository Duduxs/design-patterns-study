package patterns.behavioural.strategy.examples.fourth.strategies;

public class LambdaStrategy {

    public enum Strategy implements DragonSlayingStrategy {

        MeleeStrategy(() -> System.out.println(
                "With your Excalibur you severe the dragon's head!")),

        SpellStrategy(() -> System.out.println(
                "You cast the spell of disintegration and the dragon vaporizes in a pile of dust!")),

        ProjectileStrategy(() -> System.out.println(
                "You shoot the dragon with the magical crossbow and it falls dead on the ground!"));

        private final DragonSlayingStrategy dragonSlayingStrategy;

        Strategy(DragonSlayingStrategy dragonSlayingStrategy) {
            this.dragonSlayingStrategy = dragonSlayingStrategy;
        }

        @Override
        public void execute() {
            dragonSlayingStrategy.execute();
        }
    }
}
