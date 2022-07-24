package patterns.creational.builder.examples.third.classes;

import patterns.creational.builder.examples.third.interfaces.MealCompositeProtocol;

public abstract class AbstractMeal implements MealCompositeProtocol {

    private String name;

    private Float price;

    public AbstractMeal(String name, Float price) {
        this. name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "AbstractMeal{" + "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
