package patterns.behavioural.state.examples.first.states;

import patterns.behavioural.state.examples.first.ShoppingOrder;

public class OrderReject implements ShoppingOrderState {

    private ShoppingOrder shoppingOrder;

    public OrderReject(ShoppingOrder shoppingOrder) {
        this.shoppingOrder = shoppingOrder;
    }

    @Override
    public String getName() { return "OrderReject"; }

    @Override
    public void approvePayment() {
        System.out.println("The order was recused, so you can't approve the payment");
    }

    @Override
    public void rejectPayment() {
        System.out.println("The order is already recused");
    }

    @Override
    public void waitingPayment() {
        System.out.println("The order was recused, so you can't move the order to waiting");
    }

    @Override
    public void shipOrder() {
        System.out.println("You can't send order, because the payment was recused.");
    }
}
