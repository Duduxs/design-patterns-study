package patterns.behavioural.visitor.examples.second.visitors;

import patterns.behavioural.visitor.examples.second.objects.Commander;
import patterns.behavioural.visitor.examples.second.objects.Sergeant;
import patterns.behavioural.visitor.examples.second.objects.Soldier;

public interface UnitVisitor {

    void visitSoldier(Soldier soldier);

    void visitSergeant(Sergeant sergeant);

    void visitCommander(Commander commander);

}
