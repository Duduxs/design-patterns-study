package patterns.behavioural.mediator.examples.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

public class Mediator {

    private Collection<Seller> sellers = new ArrayList<>();

    public void addSeller(Seller ...sellers) {
        var sellerList = Arrays.asList(sellers);
        this.sellers.addAll(sellerList);
        sellerList.forEach(s -> s.setMediator(this));
    }


    public void buy(String productId) {

        Optional<SellerProduct> product = Optional.empty();

        for (Seller seller : sellers) {

             product = seller.sell(productId);

            if (product.isEmpty()) { continue; }

            System.out.println("Product bought " + product.get());
            break;
        }

        if(product.isEmpty())
            System.out.println("Not found any product with id " + productId);

    }

    public void showProducts() {
        sellers.forEach(Seller::showProducts);
    }

}
