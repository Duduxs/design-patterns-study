package patterns.creational.builder.examples.third.classes;

import patterns.creational.builder.examples.third.interfaces.MealBuilderProtocol;

/**
 * O diretor no pattern Builder define a ordem de criação dos builders.
 * Encapsulando ainda mais a estrutura dos builders e ajudando a criação de elementos do lado
 * do código cliente (código da aplicação).
 */
public class Director {

    private MealBuilderProtocol builder;

    public Director(MealBuilderProtocol builder) {
        this.builder = builder;
    }

    public void constructMainDishFood() {
        this.builder.makeMeal()
                .makeDinner()
                .makeDessert();
    }

    public void constructVeganFood() {
        this.builder.makeDinner()
                .makeMeal();
    }

}
