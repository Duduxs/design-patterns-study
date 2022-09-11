package patterns.behavioural.visitor.examples.first.visitors;

import patterns.behavioural.visitor.examples.first.products.AlcoholicDrink;
import patterns.behavioural.visitor.examples.first.products.Cigarette;
import patterns.behavioural.visitor.examples.first.products.Food;

public class BrazilTaxVisitor implements TaxVisitor {

    @Override
    public Float calculateTaxesForFood(Food food) {
        return food.getPrice() + food.getPrice() * 0.05F;
    }

    @Override
    public Float calculateTaxesForCigarette(Cigarette cigarette) {
        return cigarette.getPrice() + cigarette.getPrice() * 1.5F;
    }

    @Override
    public Float calculateTaxesForAlcoholic(AlcoholicDrink alcoholic) {
        return alcoholic.getPrice() + alcoholic.getPrice() * 0.5F;
    }

}
