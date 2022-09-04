package patterns.behavioural.mediator.examples.first;

public class Buyer {

    private Mediator mediator;

    public Buyer(Mediator mediator) {
        this.mediator = mediator;
    }

    public void viewProducts() {
        mediator.showProducts();
    }

    public void buy(String productId) {
        mediator.buy(productId);
    }

}
