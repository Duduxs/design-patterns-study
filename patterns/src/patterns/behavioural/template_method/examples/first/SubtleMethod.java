package patterns.behavioural.template_method.examples.first;

public class SubtleMethod extends StealingMethod {
    @Override
    protected String pickTarget() {
        return "Shop Keeper";
    }

    @Override
    protected void confuseTarget(String target) {
        System.out.println("Approach the " + target + " with tears running and hug him!");
    }

    @Override
    protected void stealTheItem(String target) {
        System.out.println("While in close contact grab the " + target + "'s wallet.");
    }
}
