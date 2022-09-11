package patterns.behavioural.visitor.examples.first.products;

import patterns.behavioural.visitor.examples.first.visitors.TaxVisitor;

public class AlcoholicDrink extends VisitableProducts {
    public AlcoholicDrink(String name, Float price) {
        super(name, price);
    }

    @Override
    public Float getPriceWithTaxes(TaxVisitor visitor) {
        return visitor.calculateTaxesForAlcoholic(this);
    }
}
