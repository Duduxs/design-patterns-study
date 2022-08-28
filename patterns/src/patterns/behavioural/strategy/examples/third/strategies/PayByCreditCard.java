package patterns.behavioural.strategy.examples.third.strategies;

import patterns.behavioural.strategy.examples.third.CreditCard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PayByCreditCard implements PayStrategy {

    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    private CreditCard creditCard;

    @Override
    public void collectPaymentDetails() {

        try {

            System.out.println("Give Credit card credentials");

            System.out.println("Enter the card number: ");
            String number = READER.readLine();
            System.out.println("Enter the card expiration date 'mm/yy': ");
            String date = READER.readLine();
            System.out.println("Enter the CVV code: ");
            String cvv = READER.readLine();

            creditCard = new CreditCard(number, date, cvv);

        } catch(IOException ex) {
            ex.printStackTrace();
        }


    }

    @Override
    public boolean pay(int paymentAmount) {
        if(cardIsPresent()) {
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            creditCard.setAmount(creditCard.getAmount() - paymentAmount);
            System.out.println("Payment has been successful.");
            return true;
        }

        System.out.println("FAIL! Please, check your data.");
        return false;

    }

    private boolean cardIsPresent() { return creditCard != null; }
}
