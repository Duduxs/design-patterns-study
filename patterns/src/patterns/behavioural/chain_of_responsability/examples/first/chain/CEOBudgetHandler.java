package patterns.behavioural.chain_of_responsability.examples.first.chain;

import patterns.behavioural.chain_of_responsability.examples.first.CustomerBudget;

public class CEOBudgetHandler extends BaseBudgetHandler {

    @Override
    public CustomerBudget execute(CustomerBudget budget) {
        System.out.println("CEO can handles any budget");

        budget.setApproved(true);

        return budget;
    }
}
