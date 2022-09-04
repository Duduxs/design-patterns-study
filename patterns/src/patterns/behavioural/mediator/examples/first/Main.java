package patterns.behavioural.mediator.examples.first;

public class Main {

    public static void main(String[] args) {

        var mediator = new Mediator();

        var seller1 = new Seller();

        seller1.addProduct(
                new SellerProduct("1", "T-Shirt", 49.90F),
                new SellerProduct("2", "Jeans", 400.0F)
        );

        var seller2 = new Seller();

        seller2.addProduct(
                new SellerProduct("3", "Car", 49000.00F),
                new SellerProduct("4", "Pencil", 1.90F)
        );

        mediator.addSeller(seller1, seller2);

        mediator.showProducts();

        var buyer = new Buyer(mediator);

        System.out.println();
        buyer.viewProducts();
        System.out.println();
        buyer.buy("2");
        System.out.println();
        buyer.buy("3");
        System.out.println();
        buyer.viewProducts();
    }

}
