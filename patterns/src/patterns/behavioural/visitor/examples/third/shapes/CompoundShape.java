package patterns.behavioural.visitor.examples.third.shapes;

import patterns.behavioural.visitor.examples.third.visitors.Visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CompoundShape implements Shape {

    private int id;
    public Collection<Shape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }


    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw() {

    }

    public int getId() {
        return id;
    }


    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundGraphic(this);
    }

    public void add(Shape ...shapes) {
        children.addAll(Arrays.asList(shapes));
    }

}
