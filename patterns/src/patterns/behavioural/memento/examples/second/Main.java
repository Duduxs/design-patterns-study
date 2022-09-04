package patterns.behavioural.memento.examples.second;

import java.util.Stack;

/**
 * Implementation without a caretaker (take a look so many boiderplates in client code lol)
 */
public class Main {

    public static void main(String[] args) {

        var states = new Stack<StarMemento>();

        var star = new StarOriginator(StarType.SUN, 10000000, 500000);

        System.out.println(star + "\n");

        states.add(star.backup());
        star.timePasses();

        System.out.println(star + "\n");

        states.add(star.backup());
        star.timePasses();

        System.out.println(star + "\n");

        states.add(star.backup());
        star.timePasses();

        System.out.println(star + "\n");

        states.add(star.backup());
        star.timePasses();

        System.out.println(star + "\n");

        while(states.size() > 0) {
            star.restore(states.pop());
            System.out.println(star + "\n");
        }

    }

}
