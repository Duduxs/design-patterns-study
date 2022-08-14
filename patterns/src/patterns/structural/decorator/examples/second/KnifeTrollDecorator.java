package patterns.structural.decorator.examples.second;

public class KnifeTrollDecorator extends BaseDecorator {

    public KnifeTrollDecorator(Troll wrapper) {
        super(wrapper);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("The troll swings at you with a knife!");
    }

    @Override
    public int getAttackPower() {
        return super.getAttackPower() + 5;
    }

    @Override
    public void fleeBattle() {
        System.out.println("The troll drops its knife");
        super.fleeBattle();
    }
}
