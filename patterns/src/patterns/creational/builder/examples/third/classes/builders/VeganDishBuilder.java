package patterns.creational.builder.examples.third.classes.builders;

import patterns.creational.builder.examples.third.classes.*;
import patterns.creational.builder.examples.third.interfaces.MealBuilderProtocol;

public class VeganDishBuilder implements MealBuilderProtocol {

    private MealBox mealBox = new MealBox();

    public MealBuilderProtocol reset() {
        this.mealBox = new MealBox();
        return this;
    }

    public Float getPrice() {
        return this.mealBox.getPrice();
    }

    public MealBox getMealBox() {
        return this.mealBox;
    }

    @Override
    public MealBuilderProtocol makeMeal() {

        var rice = new Rice("Arroz", 5F);
        var beans = new Bean("Feijão", 10F);

        this.mealBox.add(rice, beans);

        return this;
    }

    @Override
    public MealBuilderProtocol makeDinner() {

        var rice = new Rice("Arroz", 5F);
        var onion = new Onion("Cebola", 30F);

        this.mealBox.add(rice, onion);

        return this;
    }

    @Override
    public MealBuilderProtocol makeDessert() {

        var onion = new Onion("Cebola", 3F);

        this.mealBox.add(onion);

        return this;

    }
}
