package patterns.behavioural.strategy.examples.third.strategies;

public interface PayStrategy {

    boolean pay (int paymentAmount);
    void collectPaymentDetails();

}
