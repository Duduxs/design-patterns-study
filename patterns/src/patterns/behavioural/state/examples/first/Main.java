package patterns.behavioural.state.examples.first;

public class Main {

    public static void main(String[] args) {
        var order = new ShoppingOrder();

        order.aprovePayment(); //Approved
        order.waitPayment(); //Pending
        order.shipOrder();
        order.rejectPayment(); //From here the state can't be changed.

        order.aprovePayment();
        order.waitPayment();
        order.aprovePayment();
        order.shipOrder();

    }
}
