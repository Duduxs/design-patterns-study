package patterns.behavioural.state.examples.first.states;

public interface ShoppingOrderState {

    String getName();

    void approvePayment();
    void rejectPayment();
    void waitingPayment();
    void shipOrder();

}
