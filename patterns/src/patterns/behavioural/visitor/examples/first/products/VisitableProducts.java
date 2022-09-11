package patterns.behavioural.visitor.examples.first.products;

import patterns.behavioural.visitor.examples.first.visitors.TaxVisitor;

public abstract class VisitableProducts {

    private String name;
    private Float price;


    public VisitableProducts(String name, Float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }

    public abstract Float getPriceWithTaxes(TaxVisitor visitor);
}
