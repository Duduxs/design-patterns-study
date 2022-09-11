package patterns.behavioural.visitor.examples.first;

import patterns.behavioural.visitor.examples.first.products.Cigarette;
import patterns.behavioural.visitor.examples.first.products.Food;
import patterns.behavioural.visitor.examples.first.products.VisitableProducts;
import patterns.behavioural.visitor.examples.first.visitors.BrazilTaxVisitor;
import patterns.behavioural.visitor.examples.first.visitors.TaxVisitor;
import patterns.behavioural.visitor.examples.first.visitors.USTaxVisitor;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        var food = new Food("food", 10F);
        var cigarette = new Cigarette("cigarrete", 5F);
        var alcoholicDrink = new Food("drink", 5F);

        TaxVisitor brazilVisitor = new BrazilTaxVisitor();
        TaxVisitor usVisitor = new USTaxVisitor();

        List<VisitableProducts> cart = List.of(food, cigarette, alcoholicDrink);

        Float total = cart.stream().map(VisitableProducts::getPrice).reduce(0F, Float::sum);
        Float totalWithBrazilTaxes = cart.stream().map(v -> v.getPriceWithTaxes(brazilVisitor)).reduce(0F, Float::sum);
        Float totalWithUSTaxes = cart.stream().map(v -> v.getPriceWithTaxes(usVisitor)).reduce(0F, Float::sum);

        System.out.println(total);
        System.out.println();
        System.out.println("Brazil total price: " + totalWithBrazilTaxes);
        System.out.println("US total price: " + totalWithUSTaxes);

    }

}
