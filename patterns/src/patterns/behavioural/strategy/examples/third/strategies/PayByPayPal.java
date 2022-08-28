package patterns.behavioural.strategy.examples.third.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PayByPayPal implements PayStrategy {

    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    private String email;
    private String password;
    private boolean signedIn;

    /**
     * Saving some customer data for future shopping attemps with paypal method;
     */
    static {
        DATA_BASE.put("eduardo", "eduardo@hotmail.com");
        DATA_BASE.put("joão", "joão@amazon.eu");
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while(!signedIn) {

                System.out.println("Give Paypal credentials");

                System.out.println("Enter the user's email: ");
                email = READER.readLine();
                System.out.println("Enter the password: ");
                password = READER.readLine();

                if(isAValidUser()) {
                    System.out.println("Data verification has ben successful.");
                } else {
                    System.out.println("Wrong email or password!");
                }
            }

        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean isAValidUser() {
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }

    /**
     * We could save user here after it pay
     */
    @Override
    public boolean pay(int paymentAmount) {

        if(signedIn) {
            System.out.println("Paying " + paymentAmount + " using Paypal.");
            System.out.println("Payment has been successful.");
            return true;
        }

        System.out.println("FAIL! Please, check your data.");
        return false;

    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }
}
