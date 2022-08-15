package patterns.structural.proxy.examples.first;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AdminUser implements SystemUserProtocol {

    private String firstName;
    private String username;

    public AdminUser(String firstName, String username) {
        this.firstName = firstName;
        this.username = username;
    }

    @Override
    public Collection<String> getAddresses() {
        try {
            Thread.sleep(6000);
            return List.of("First Address", "Second Address", "Third Address");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
