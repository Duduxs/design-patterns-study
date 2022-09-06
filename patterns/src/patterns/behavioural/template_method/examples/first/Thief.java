package patterns.behavioural.template_method.examples.first;

public class Thief {

    private StealingMethod stealingMethod;

    public Thief(StealingMethod stealingMethod) {
        this.stealingMethod = stealingMethod;
    }

    public void changeMethodInRuntime(StealingMethod stealingMethod) {
        this.stealingMethod = stealingMethod;
    }

    public void steal() {
        stealingMethod.steal();
    }

}
