package patterns.behavioural.visitor.examples.third.shapes;

import patterns.behavioural.visitor.examples.third.visitors.Visitor;

public class Circle extends Dot {

    private int radius;

    public Circle(int id, int x, int y, int radius) {
        super(id, x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw() {

    }
}
