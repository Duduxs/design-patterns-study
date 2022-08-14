package patterns.structural.decorator.examples.second;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ClubbedTrollBaseDecorator troll = new KnifeTrollDecorator(
                new SimpleTroll()
        );

        System.out.println("Troll attk power: " + troll.getAttackPower());

        troll.attack();

        Thread.sleep(3000);

        troll.fleeBattle();
    }

}
