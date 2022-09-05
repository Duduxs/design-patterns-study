package patterns.behavioural.chain_of_responsability.examples.first.chain;

import patterns.behavioural.chain_of_responsability.examples.first.CustomerBudget;

public class SellerBudgetHandler extends BaseBudgetHandler {

    @Override
    public CustomerBudget execute(CustomerBudget budget) {

        if(budget.getPrice() <= 1000F) {
            System.out.println("Seller handled the budget");
            budget.setApproved(true);
            return budget;
        }

        System.out.println("Seller not handled the budget");


        return super.execute(budget);
    }
}
