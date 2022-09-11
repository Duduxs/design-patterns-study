package patterns.behavioural.visitor.examples.third.visitors;

import patterns.behavioural.visitor.examples.third.shapes.Circle;
import patterns.behavioural.visitor.examples.third.shapes.CompoundShape;
import patterns.behavioural.visitor.examples.third.shapes.Dot;
import patterns.behavioural.visitor.examples.third.shapes.Rectangle;

public interface Visitor {

    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);

}
