package patterns.behavioural.chain_of_responsability.examples.first;

import patterns.behavioural.chain_of_responsability.examples.first.chain.CEOBudgetHandler;
import patterns.behavioural.chain_of_responsability.examples.first.chain.DirectorBudgetHandler;
import patterns.behavioural.chain_of_responsability.examples.first.chain.ManagerBudgetHandler;
import patterns.behavioural.chain_of_responsability.examples.first.chain.SellerBudgetHandler;

public class Main {

    public static void main(String[] args) {

        var budget = new CustomerBudget(50001F);

        var sellerHandler = new SellerBudgetHandler();

        sellerHandler
                .next(ManagerBudgetHandler.class)
                .next(DirectorBudgetHandler.class)
                .next(CEOBudgetHandler.class);

        var value = sellerHandler.execute(budget);

        System.out.println(value);

    }
}
