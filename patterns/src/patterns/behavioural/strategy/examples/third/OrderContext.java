package patterns.behavioural.strategy.examples.third;

import patterns.behavioural.strategy.examples.third.strategies.PayStrategy;

/**
 * Order class. Doesn't know the concrete payment method (Strategy) user has picked.
 * It uses common strategy interface to delegate collecting payment data to strategy object.
 * It also can be used to save order to database.
 */

public class OrderContext {

    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(PayStrategy payStrategy) {
        payStrategy.collectPaymentDetails();
        // Here we could collect and store payment data from the strategy.
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost += totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
