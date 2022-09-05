package patterns.behavioural.chain_of_responsability.examples.first.chain;

import patterns.behavioural.chain_of_responsability.examples.first.CustomerBudget;

public class DirectorBudgetHandler extends BaseBudgetHandler {

    @Override
    public CustomerBudget execute(CustomerBudget budget) {

        if(budget.getPrice() <= 50000F) {
            System.out.println("Director handled the budget");
            budget.setApproved(true);
            return budget;
        }

        System.out.println("Director not handled the budget");


        return super.execute(budget);
    }
}
