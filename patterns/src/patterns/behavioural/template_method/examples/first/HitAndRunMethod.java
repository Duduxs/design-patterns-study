package patterns.behavioural.template_method.examples.first;

public class HitAndRunMethod extends StealingMethod {

    @Override
    protected String pickTarget() {
        return "Old Globin Woman";
    }

    @Override
    protected void confuseTarget(String target) {
        System.out.println("Approach the " + target + " from behind.");
    }

    @Override
    protected void stealTheItem(String target) {
        System.out.println("Grab the handbag and run away fast!");
    }

    @Override
    public void hook() {
        System.out.println("***************************************");
    }
}
