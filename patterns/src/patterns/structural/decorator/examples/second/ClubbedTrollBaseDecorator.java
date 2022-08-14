package patterns.structural.decorator.examples.second;

public class ClubbedTrollBaseDecorator implements Troll {

    private Troll wrapper;

    public ClubbedTrollBaseDecorator(Troll wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void attack() {
        wrapper.attack();
        System.out.println("The troll swings at you with a club!");
    }

    @Override
    public int getAttackPower() {
        return wrapper.getAttackPower() + 10;
    }

    @Override
    public void fleeBattle() {
        wrapper.fleeBattle();
    }
}
