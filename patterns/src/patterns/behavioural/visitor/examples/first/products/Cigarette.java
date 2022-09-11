package patterns.behavioural.visitor.examples.first.products;

import patterns.behavioural.visitor.examples.first.visitors.TaxVisitor;

public class Cigarette extends VisitableProducts {
    public Cigarette(String name, Float price) {
        super(name, price);
    }

    @Override
    public Float getPriceWithTaxes(TaxVisitor visitor) {
        return visitor.calculateTaxesForCigarette(this);
    }
}
