package patterns.behavioural.template_method.examples.second;

public abstract class Network {

    String username;
    String password;

    Network () {}

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public final boolean post(String message) {

        if(login(username, password)) {
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }

        return false;

    }

    abstract boolean login(String username, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();

    public void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}
