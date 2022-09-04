package patterns.behavioural.state.examples.first.states;

import patterns.behavioural.state.examples.first.ShoppingOrder;

public class OrderPending implements ShoppingOrderState {

    private ShoppingOrder shoppingOrder;

    public OrderPending(ShoppingOrder shoppingOrder) {
        this.shoppingOrder = shoppingOrder;
    }

    @Override
    public String getName() {
        return "OrderPending";
    }

    @Override
    public void approvePayment() {
        this.shoppingOrder.setState(new OrderApproved(this.shoppingOrder));
    }

    @Override
    public void rejectPayment() {
        this.shoppingOrder.setState(new OrderReject(this.shoppingOrder));
    }

    @Override
    public void waitingPayment() {
        System.out.println("The order is already in order pending state.");
    }

    @Override
    public void shipOrder() {
        System.out.println("You can't send the order to client, because the order is pending.");
    }

}
