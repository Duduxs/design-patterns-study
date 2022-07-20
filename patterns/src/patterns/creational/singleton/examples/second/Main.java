package patterns.creational.singleton.examples.second;

import java.util.ArrayList;
import java.util.List;

//Singleton with Thread Safety
public class Main {
    public static void main(String[] args) {

        final var productFactoryThreadSafety = ProductFactoryThreadSafety.SINGLETON;

        productFactoryThreadSafety.createProduct(ProductType.DIGITAL);

        //TRUE! Must be the same instances
        System.out.println(ProductFactoryThreadSafety.SINGLETON == productFactoryThreadSafety);

        //Must've one
        System.out.println(ProductFactoryThreadSafety.SINGLETON.products.size());
        System.out.println(ProductFactoryThreadSafety.SINGLETON.products.get(0).getClass().getSimpleName());


    }
}

interface Product { }
record DigitalProduct() implements Product { }
class FisicProduct implements Product { }

enum ProductType { DIGITAL, FISIC }

// It's more useful to create singleton in this mode, because it became Thread Safety
enum ProductFactoryThreadSafety {
    SINGLETON;

    List<Product> products = new ArrayList<>();

    public Product createProduct(final ProductType type) {

        final var produt = switch (type) {
            case DIGITAL -> new DigitalProduct();
            case FISIC -> new FisicProduct();
        };

        products.add(produt);

        return produt;

    }
}
