package patterns.behavioural.strategy.examples.fourth;

import patterns.behavioural.strategy.examples.fourth.strategies.LambdaStrategy;
import patterns.behavioural.strategy.examples.fourth.strategies.MeleeStrategy;

public class Main {

    public static void main(String[] args) {

        System.out.println("====================");
        System.out.println("Simple strategy impl");

        /**
         * SIMPLE STRATEGY
         */

        var dragonSlayer = new DragonSlayerContext(new MeleeStrategy());

        dragonSlayer.goToBattle();


        System.out.println("\nStrategy with java functional interfaces");

        /**
         * WITH JAVA FUNCTIONAL INTERFACES
         */
        dragonSlayer = new DragonSlayerContext(
                () -> System.out.println("Executing some strategy code")
        );

        dragonSlayer.goToBattle();

        System.out.println("\nStrategy with java lambda");

        /**
         * WITH JAVA LAMBDA ENUM
         */
        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.MeleeStrategy);
        dragonSlayer.goToBattle();

        System.out.println("====================");
    }

}
