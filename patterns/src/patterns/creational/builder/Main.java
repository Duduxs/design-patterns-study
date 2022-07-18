package patterns.creational.builder;

public class Main {

    public static void main(String[] args) {
        var product = new Product.Builder().withId("1").withPrice(2.0).build();
        System.out.println(product);

    }
}