package patterns.structural.decorator.examples.second;

public class BaseDecorator implements Troll {

    private Troll wrapper;

    public BaseDecorator(Troll wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void attack() {
        wrapper.attack();
    }

    @Override
    public int getAttackPower() {
        return wrapper.getAttackPower();
    }

    @Override
    public void fleeBattle() {
        wrapper.fleeBattle();
    }
}
