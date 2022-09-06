package patterns.behavioural.template_method.examples.first;

public abstract class StealingMethod {

    protected abstract String pickTarget();

    protected abstract void confuseTarget(String target);

    protected abstract void stealTheItem(String target);

    public void hook() { }

    /**
     * Template method
     */
    public void steal() {
        hook();
        var target = pickTarget();
        confuseTarget(target);
        stealTheItem(target);
        hook();
    }

}
