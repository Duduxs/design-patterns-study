package patterns.behavioural.visitor.examples.third.shapes;

import patterns.behavioural.visitor.examples.third.visitors.Visitor;

public class Dot implements Shape {

    private int id;
    private int x;
    private int y;

    public Dot() { }

    public Dot(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
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

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitDot(this);
    }
}
