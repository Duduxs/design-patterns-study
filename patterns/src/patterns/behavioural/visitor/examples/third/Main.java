package patterns.behavioural.visitor.examples.third;

import patterns.behavioural.visitor.examples.third.shapes.*;
import patterns.behavioural.visitor.examples.third.visitors.XMLExportVisitor;

public class Main {

    public static void main(String[] args) {

        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        CompoundShape anotherCompoundShape = new CompoundShape(5);

        anotherCompoundShape.add(dot);

        compoundShape.add(dot, circle, rectangle, anotherCompoundShape);

        export(circle);
        export(compoundShape);
    }

    private static void export(Shape... shapes) {
        XMLExportVisitor visitor = new XMLExportVisitor();
        System.out.println(visitor.export(shapes));
    }
}
