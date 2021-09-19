package creational.builder;

import creational.singleton.db.MyDatabaseClassic;
import creational.singleton.db.User;

public class Main {

    public static void main(String[] args) {
        var product = new Product.Builder().withId("1").withPrice(2.0).build();
        System.out.println(product);

    }
}