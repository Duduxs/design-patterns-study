package patterns.creational.builder.examples.third;

import patterns.creational.builder.examples.third.classes.Director;
import patterns.creational.builder.examples.third.classes.builders.MainDishBuilder;
import patterns.creational.builder.examples.third.classes.builders.VeganDishBuilder;

public class Main {

    public static void main(String[] args) {

        //Primeiro exemplo MainDishBuilder sem o uso de director
        var mainDishBuilder = new MainDishBuilder();

        mainDishBuilder.makeMeal()
                .makeDessert();

        System.out.println(mainDishBuilder.getMealBox());
        System.out.println(mainDishBuilder.getPrice());

        mainDishBuilder.reset()
                .makeDinner();

        System.out.println(mainDishBuilder.getMealBox());
        System.out.println(mainDishBuilder.getPrice());

        //Segundo exemplo VeganDishBuilder com o uso de director
        var veganDishBuilder = new VeganDishBuilder();
        var director = new Director(veganDishBuilder);

        director.constructVeganFood();

        System.out.println("\n" + veganDishBuilder.getMealBox());
        System.out.println(veganDishBuilder.getPrice());


    }

}
