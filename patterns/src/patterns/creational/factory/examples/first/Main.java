package patterns.creational.factory.examples.first;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //Static factory methods
        Calendar.getInstance();
        BigDecimal.valueOf(23L);
        Stream.of(1, 2, 3, 4);
        List.of(1, 2, 3, 4);

        //Factory methods DEFAULT
        final var digitalFactory = new DigitalFactory();
        final var fisicFactory = new FisicFactory();

        DigitalProduct dp = digitalFactory.createProduct();
        FisicProduct fp = fisicFactory.createProduct();
    }

}
interface Product {}

class DigitalProduct implements Product {}

class FisicProduct implements Product {}

interface Factory {
    Product createProduct();
}

class DigitalFactory implements Factory {
    //Alguns atributos aqui e também possibilidade de por regras no método createProduct
    @Override
    public DigitalProduct createProduct() {
        return new DigitalProduct();
    }
}

class FisicFactory implements Factory {
    //Alguns atributos aqui e também possibilidade de por regras no método createProduct
    @Override
    public FisicProduct createProduct() {
        return new FisicProduct();
    }
}
