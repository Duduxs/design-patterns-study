package patterns.creational.builder.examples.third.classes;

import patterns.creational.builder.examples.third.interfaces.MealCompositeProtocol;

import java.util.Collection;
import java.util.HashSet;

import static java.util.Arrays.asList;

public class MealBox implements MealCompositeProtocol {

    private Collection<MealCompositeProtocol> children = new HashSet<>();

    public void add(MealCompositeProtocol... values) {
        children.addAll(asList(values));
    }

    @Override
    public Float getPrice() {
        return children.stream()
                .map(MealCompositeProtocol::getPrice)
                .reduce(0F, Float::sum);
    }

    @Override
    public String toString() {
        return "MealBox{" + "children=" + children +
                '}';
    }
}
