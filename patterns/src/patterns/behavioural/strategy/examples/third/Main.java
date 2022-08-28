package patterns.behavioural.strategy.examples.third;

import patterns.behavioural.strategy.examples.third.strategies.PayStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Client code
 */
public class Main {

    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    private static OrderContext order = new OrderContext();

    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {

        while (!order.isClosed()) {
            int cost;

            String continueChoice;

            StringBuilder sb = new StringBuilder();

            sb.append("Please, select a product: \n");
            sb.append("1 - Mother board\n");
            sb.append("2 - CPU\n");
            sb.append("3 - HDD\n");
            sb.append("4 - Memory\n");

            do {

                System.out.println(sb);

                int choice = Integer.parseInt(READER.readLine());
                cost = priceOnProducts.get(choice);

                System.out.println("Count: ");
                int count = Integer.parseInt(READER.readLine());

                order.setTotalCost(cost * count);

                System.out.println("Do you with to continue selecting products? Y/N");

                continueChoice = READER.readLine();

            } while (continueChoice.equalsIgnoreCase("Y"));

            if(strategy == null) {

                System.out.printf("Please, select a payment method %n 1 - Paypal %n 2 - Credit Card %n");

                PayStrategy strategy = PaymentMethods.getByKey(READER.readLine()).getConstructor().get();

                order.processOrder(strategy);

                System.out.println("Pay " + order.getTotalCost() + " units or Continue shopping? P/C: ");

                String proceed = READER.readLine();

                if(!proceed.equalsIgnoreCase("P")) continue;

                strategy.pay(order.getTotalCost());
                order.setClosed();

            }

        }

    }


}
