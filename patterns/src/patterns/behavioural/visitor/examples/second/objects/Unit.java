package patterns.behavioural.visitor.examples.second.objects;

import patterns.behavioural.visitor.examples.second.visitors.UnitVisitor;

import java.util.Arrays;

public abstract class Unit {

    private final Unit[] children;

    public Unit(Unit... children) {
        this.children = children;
    }

    public void accept(UnitVisitor visitor) {
        Arrays.stream(children).forEach(child -> child.accept(visitor));
    }

}
