package creational.singleton.example2;

import static creational.singleton.example2.ProductType.DIGITAL;
import static creational.singleton.example2.ProductType.FISIC;

public class Main {
    public static void main(String[] args) {
        final var productFactory = ProductFactory.getInstance();

        productFactory.createProduct(FISIC);
        productFactory.createProduct(DIGITAL);

        //TRUE! Devem ser as mesmas instâncias, pois também utilizo aqui o Singleton
        System.out.println(ProductFactory.getInstance() == productFactory);

        //Implementação thread Safety
        final var productFactoryThreadSafety = ProductFactoryThreadSafety.SINGLETON;
        System.out.println(ProductFactoryThreadSafety.SINGLETON == productFactoryThreadSafety);
    }
}

interface Product {  }

class DigitalProduct implements Product { }
class FisicProduct implements Product { }

enum ProductType { DIGITAL, FISIC }

//Simple factory method + Singleton pattern
class ProductFactory {

    private static ProductFactory instance;

    private ProductFactory() {}

    public static ProductFactory getInstance() {
        if(ProductFactory.instance == null)  { instance = new ProductFactory(); }
        return ProductFactory.instance;
    }

    public Product createProduct(final ProductType type) {
         switch (type) {
           case DIGITAL:
               return new DigitalProduct();
           case FISIC:
                return new FisicProduct();
             default:
                 throw new IllegalArgumentException("Opperation not mapped!");
       }
    }
}

//É mais adequado utilizar o singleton dessa forma, pois ele fica Thread Safety
enum ProductFactoryThreadSafety {
    SINGLETON;

    public Product createProduct(final ProductType type) {
        switch (type) {
            case DIGITAL:
                return new DigitalProduct();
            case FISIC:
                return new FisicProduct();
            default:
                throw new IllegalArgumentException("Opperation not mapped!");
        }
    }
}
