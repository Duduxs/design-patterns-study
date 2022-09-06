package patterns.behavioural.template_method.examples.second;

public class Facebook extends Network {

    public Facebook() { }

    public Facebook(String username, String password) {
        this.username = username;
        this.password = password;
    }





    @Override
    /**
     * Imagine that this method implementation is COMPLETELY different of
     * the other subclass implementation
     */
    boolean login(String username, String password) {

        System.out.println("\nChecking user's parameters");
        System.out.println("Name: " + this.username);
        System.out.println("Password: " + this.password);

        for(var i = 0 ; i < this.password.length() ; i++) {
            System.out.println("*");
        }

        simulateNetworkLatency();
        System.out.println("\n\nLogIn success on Facebook");

        return true;

    }

    @Override
    /**
     * Imagine that this method implementation is COMPLETELY different of
     * the other subclass implementation
     */
    boolean sendData(byte[] data) {
       boolean messagePosted = true;

       if(messagePosted) {
           System.out.println("Message: " + new String(data) + " was posted on Facebook");
           return true;
       }

        return false;
    }

    @Override
    /**
     * Imagine that this method implementation is COMPLETELY different of
     * the other subclass implementation
     */
    void logOut() {
        System.out.println("User: " + username + " was logged out from Facebook");
    }

}
