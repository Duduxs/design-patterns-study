package patterns.creational.builder.examples.third.interfaces;

public interface MealBuilderProtocol {

    MealBuilderProtocol makeMeal();
    MealBuilderProtocol makeDinner();
    MealBuilderProtocol makeDessert();

}
