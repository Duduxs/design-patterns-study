package patterns.behavioural.visitor.examples.third.shapes;

import patterns.behavioural.visitor.examples.third.visitors.Visitor;

public interface Shape {

    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);

}
