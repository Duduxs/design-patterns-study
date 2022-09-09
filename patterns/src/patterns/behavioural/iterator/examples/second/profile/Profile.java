package patterns.behavioural.iterator.examples.second.profile;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Profile {

    private String name;
    private String email;
    private Map<String, Collection<String>> contacts = new HashMap<>();

    public Profile(String email, String name, String... contacts) {
        this.name = name;
        this.email = email;

        for(String contact: contacts) {

            String[] parts = contact.split(":");
            String contactType = "friend", contactEmail;

            if(parts.length == 1) {
                contactEmail = parts[0];
            } else {
                contactType = parts[0];
                contactEmail = parts[1];
            }

            if(!this.contacts.containsKey(contactType)) {
                this.contacts.put(contactType, new ArrayList<>());
            }

            this.contacts.get(contactType).add(contactEmail);

        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Collection<String> getContacts(String contactType) {
        if(!this.contacts.containsKey(contactType)) {
            this.contacts.put(contactType, new ArrayList<>());
        }
        return contacts.get(contactType);
    }

}
