package patterns.creational.builder.examples.third.classes;

import patterns.creational.builder.examples.third.interfaces.MealBuilderProtocol;

/**
 * O diretor no pattern Builder define a ordem e a forma de criação dos builders.
 * Ou seja, qual será a ordem de cada método chain e também quais serão os métodos de determinado builder chamado.
 * Ele ajuda ainda mais a encapsular a estrutura dos builders e ajudando a criação de elementos do lado
 * do código cliente (código da aplicação), ou seja, quem for utilizar algum builder em alguma parte do app.
 * Com ele, conseguimos remover chamadas chains repetidas (que semprem seguem o mesmo padrão) pela aplicação.
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
