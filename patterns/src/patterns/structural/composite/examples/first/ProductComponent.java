package patterns.structural.composite.examples.first;

//Interface em comum que os composite & os leaf implementam.
abstract class ProductComponent {

    abstract Float getPrice();

    void add(ProductComponent ...productComponent) { }

    void remove(ProductComponent productComponent) { }

}
