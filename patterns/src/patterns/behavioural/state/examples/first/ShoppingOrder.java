package patterns.behavioural.state.examples.first;

import patterns.behavioural.state.examples.first.states.OrderPending;
import patterns.behavioural.state.examples.first.states.ShoppingOrderState;

public class ShoppingOrder {

    private ShoppingOrderState state = new OrderPending(this);

    public ShoppingOrderState getState() {
        return state;
    }

    public void setState(ShoppingOrderState state) {
        this.state = state;
        System.out.println("Status changed to " + state.getName());
    }

    public String getStateName() {
        return this.state.getName();
    }

    public void aprovePayment() {
        this.state.approvePayment();
    }

    public void rejectPayment() {
        this.state.rejectPayment();
    }

    public void waitPayment() {
        this.state.waitingPayment();
    }

    public void shipOrder() {
        this.state.shipOrder();
    }

}
