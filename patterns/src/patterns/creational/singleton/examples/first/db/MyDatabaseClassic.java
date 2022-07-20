package patterns.creational.singleton.example1.db;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class MyDatabaseClassic {

    private static MyDatabaseClassic instance;

    private Collection<User> users = new ArrayList<>();

    private MyDatabaseClassic() {}

    public static MyDatabaseClassic getInstance() {
        instance = Objects.requireNonNullElseGet(MyDatabaseClassic.instance, MyDatabaseClassic::new);
        return instance;
    }

    public void add(final User user) {
        this.users.add(user);
    }

    public void remove(final User user) {
        this.users.remove(user);
    }

    public void show() {
        this.users.stream().map(User::getName).forEach(System.out::println);
    }
}
