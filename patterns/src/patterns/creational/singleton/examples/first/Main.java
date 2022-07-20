package patterns.creational.singleton.example1;

import patterns.creational.singleton.example1.db.MyDatabaseClassic;
import patterns.creational.singleton.example1.db.User;

public class Main {

    public static void main(String[] args) {

        var myDatabaseClassic = MyDatabaseClassic.getInstance();
        var myDatabaseClassic2 = MyDatabaseClassic.getInstance();

        myDatabaseClassic.add(new User("Eduardo"));
        myDatabaseClassic.add(new User("João"));
        myDatabaseClassic.add(new User("Maria"));

        myDatabaseClassic.show();

        // True! Singleton works!
        System.out.println(myDatabaseClassic == myDatabaseClassic2);

    }
}
