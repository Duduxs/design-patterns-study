package patterns.structural.proxy.examples.first;

import java.util.ArrayList;
import java.util.Collection;

public class SystemUserProxy implements SystemUserProtocol {

    private String firstName;
    private String username;

    private SystemUserProtocol realUser = null;
    private Collection<String> realUserAddresses = new ArrayList<>();

    public SystemUserProxy(String firstName, String username) {
        this.firstName = firstName;
        this.username = username;
    }

    private SystemUserProtocol createUser() {
        if(realUser == null) {
            realUser = new AdminUser(firstName, username);
        }
        return this.realUser;
    }

    @Override
    public Collection<String> getAddresses() {
        this.realUser = this.createUser();

        if(this.realUserAddresses.isEmpty()) {
            this.realUserAddresses = realUser.getAddresses();
        }

        return this.realUserAddresses;
    }
}
