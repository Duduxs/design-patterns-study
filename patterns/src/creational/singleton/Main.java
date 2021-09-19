package creational.singleton;

import creational.singleton.db.MyDatabaseClassic;
import creational.singleton.db.User;

public class Main {

    public static void main(String[] args) {
        var myDatabaseClassic = MyDatabaseClassic.getInstance();
        var myDatabaseClassic2 = MyDatabaseClassic.getInstance();

        myDatabaseClassic.add(new User("Eduardo"));
        myDatabaseClassic.add(new User("João"));
        myDatabaseClassic.add(new User("Maria"));

        myDatabaseClassic.show();

        System.out.println(myDatabaseClassic == myDatabaseClassic2);

    }
}
