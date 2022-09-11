package patterns.behavioural.visitor.examples.second.visitors;

import patterns.behavioural.visitor.examples.second.objects.Commander;
import patterns.behavioural.visitor.examples.second.objects.Sergeant;
import patterns.behavioural.visitor.examples.second.objects.Soldier;

public class UnitVisitorImpl implements UnitVisitor {

    @Override
    public void visitSoldier(Soldier soldier) {
        System.out.println("Greetings " + soldier);
    }

    @Override
    public void visitSergeant(Sergeant sergeant) {
        System.out.println("Hello " + sergeant);
    }

    @Override
    public void visitCommander(Commander commander) {
        System.out.println("Good to see you " + commander);
    }
}
