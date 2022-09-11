package patterns.behavioural.visitor.examples.second.objects;

import patterns.behavioural.visitor.examples.second.visitors.UnitVisitor;

public class Sergeant extends Unit {

    public Sergeant(Unit... children) {
        super(children);
    }

    @Override
    public void accept(UnitVisitor visitor){
        visitor.visitSergeant(this);
        super.accept(visitor);
    }


    @Override
   public String toString() {
        return "sergeant";
    }
}
