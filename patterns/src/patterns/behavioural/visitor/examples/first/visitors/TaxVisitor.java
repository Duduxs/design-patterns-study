package patterns.behavioural.visitor.examples.first.visitors;

import patterns.behavioural.visitor.examples.first.products.AlcoholicDrink;
import patterns.behavioural.visitor.examples.first.products.Cigarette;
import patterns.behavioural.visitor.examples.first.products.Food;

public interface TaxVisitor {

    Float calculateTaxesForFood(Food food);
    Float calculateTaxesForCigarette(Cigarette cigarette);
    Float calculateTaxesForAlcoholic(AlcoholicDrink alcoholic);

}
