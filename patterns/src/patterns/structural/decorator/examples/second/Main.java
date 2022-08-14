package patterns.structural.decorator.examples.second;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // simple troll
        System.out.println("A simple looking troll approaches.");

        var simpleTroll = new SimpleTroll();

        System.out.println("Simple troll atk power: " + simpleTroll.getAttackPower());

        simpleTroll.attack();
        Thread.sleep(3000);
        simpleTroll.fleeBattle();

        Thread.sleep(2000);

        System.out.println();
        System.out.println("A troll with a knife surprises you");

        //Change the behaviour of the simple troll by adding a decorator.
        BaseDecorator knifeTroll = new KnifeTrollDecorator(simpleTroll);

        System.out.println("Troll atk power: " + knifeTroll.getAttackPower());

        knifeTroll.attack();
        Thread.sleep(3000);
        knifeTroll.fleeBattle();

    }

}
