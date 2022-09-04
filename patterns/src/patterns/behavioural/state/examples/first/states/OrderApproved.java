package patterns.behavioural.state.examples.first.states;

import patterns.behavioural.state.examples.first.ShoppingOrder;

public class OrderApproved implements ShoppingOrderState {

    private ShoppingOrder shoppingOrder;

    public OrderApproved(ShoppingOrder shoppingOrder) {
        this.shoppingOrder = shoppingOrder;
    }

    @Override
    public String getName() { return "OrderApproved"; }

    @Override
    public void approvePayment() {
        System.out.println("The order is already in order approved state.");
    }

    @Override
    public void rejectPayment() {
        this.shoppingOrder.setState(new OrderReject(shoppingOrder));
    }

    @Override
    public void waitingPayment() {
        this.shoppingOrder.setState(new OrderPending(shoppingOrder));
    }

    @Override
    public void shipOrder() {
        System.out.println("Sending order to the client");
    }

}
