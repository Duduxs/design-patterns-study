package patterns.behavioural.chain_of_responsability.examples.first.chain;

import patterns.behavioural.chain_of_responsability.examples.first.CustomerBudget;

public abstract class BaseBudgetHandler {

    protected BaseBudgetHandler nextHandler;

    public BaseBudgetHandler() {};

    public BaseBudgetHandler next(Class<? extends BaseBudgetHandler> handler) {
        try {
            this.nextHandler = handler.getConstructor().newInstance();
            return this.nextHandler;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public CustomerBudget execute(CustomerBudget budget) {
        if (this.nextHandler != null)
            return nextHandler.execute(budget);

        return budget;
    }

}
