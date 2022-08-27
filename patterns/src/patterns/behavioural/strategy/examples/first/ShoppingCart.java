package patterns.behavioural.strategy.examples.first;

import patterns.behavioural.strategy.examples.first.strategies.DiscountStrategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

public class ShoppingCart {

    private Collection<Product> products = new ArrayList<>();

    private DiscountStrategy discountStrategy;

    public void addProduct(Product... products) {
        this.products.addAll(Arrays.asList(products));
    }

    public Collection<Product> getProducts() {
        return products;
    }

    public Integer getSubTotal() {
        return products.stream().map(Product::getPrice).reduce(0, Integer::sum);
    }

    public Integer getTotalWithDiscount() {
        return Optional.ofNullable(this.discountStrategy).map(ds -> ds.getDiscount(this)).orElse(getSubTotal());
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
}
