package patterns.behavioural.visitor.examples.first.products;

import patterns.behavioural.visitor.examples.first.visitors.TaxVisitor;

public class Food extends VisitableProducts {

    public Food(String name, Float price) {
        super(name, price);
    }

    @Override
    public Float getPriceWithTaxes(TaxVisitor visitor) {
        return visitor.calculateTaxesForFood(this);
    }

}
