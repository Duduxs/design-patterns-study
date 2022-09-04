package patterns.behavioural.mediator.examples.first;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class Seller {

    private Collection<SellerProduct> products = new ArrayList<>();
    private Mediator mediator;


    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void showProducts() {
        products.forEach(System.out::println);
    }

    public void addProduct(SellerProduct ...products) {
        this.products.addAll(List.of(products));
    }

    public Optional<SellerProduct> sell(String productId) {
        var product = products.stream().filter(p -> p.getId().equals(productId)).findFirst();

        if(product.isEmpty()) return product;

        products.remove(product.get());

        return product;

    }

}
