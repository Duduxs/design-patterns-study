package patterns.structural.proxy.examples.second;

public class Main {

    public static void main(String[] args) {

        var wizard = new Wizard("Eduardo");
        var wizard2 = new Wizard("Jonas");
        var wizard3 = new Wizard("Rafael");
        var wizard4 = new Wizard("Raul");

        WizardTower tower = new WizardTowerProxy(new IvoryTower());

        tower.enter(wizard);
        tower.enter(wizard2);
        tower.enter(wizard3);
        tower.enter(wizard4);

    }

}
