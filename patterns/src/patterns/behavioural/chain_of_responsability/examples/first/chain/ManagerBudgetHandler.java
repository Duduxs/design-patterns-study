package patterns.behavioural.chain_of_responsability.examples.first.chain;

import patterns.behavioural.chain_of_responsability.examples.first.CustomerBudget;

public class ManagerBudgetHandler extends BaseBudgetHandler {

    @Override
    public CustomerBudget execute(CustomerBudget budget) {

        if(budget.getPrice() <= 5000F) {
            System.out.println("Manager handled the budget");
            budget.setApproved(true);
            return budget;
        }

        System.out.println("Manager not handled the budget");


        return super.execute(budget);
    }
}
