package patterns.behavioural.visitor.examples.second;

import patterns.behavioural.visitor.examples.second.objects.Commander;
import patterns.behavioural.visitor.examples.second.objects.Sergeant;
import patterns.behavioural.visitor.examples.second.objects.Soldier;
import patterns.behavioural.visitor.examples.second.visitors.UnitVisitorImpl;

public class Main {

    public static void main(String[] args) {

        var soldierRaphael = new Soldier();
        var soldierJoao = new Soldier();
        var sergeantNycolas = new Sergeant(soldierRaphael, soldierJoao);
        var eduardoCommander = new Commander(sergeantNycolas);

        var visitor = new UnitVisitorImpl();

        eduardoCommander.accept(visitor);

    }

}
