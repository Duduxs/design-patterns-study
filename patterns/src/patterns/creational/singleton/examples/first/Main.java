package patterns.creational.singleton.examples.first;

import patterns.creational.singleton.examples.first.db.MyDatabaseClassic;
import patterns.creational.singleton.examples.first.db.User;

public class Main {

    public static void main(String[] args) {

        var myDatabaseClassic = MyDatabaseClassic.getInstance();
        var myDatabaseClassic2 = MyDatabaseClassic.getInstance();

        myDatabaseClassic.add(new User("Eduardo"));
        myDatabaseClassic.add(new User("João"));
        myDatabaseClassic.add(new User("Maria"));

        //Using same instance
        myDatabaseClassic2.add(new User("Same instance"));

        myDatabaseClassic.show();

        // True! Singleton works!
        System.out.println(myDatabaseClassic == myDatabaseClassic2);

    }
}
