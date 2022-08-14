package patterns.structural.decorator.examples.first.decorators;

import patterns.structural.decorator.examples.first.notifiers.Notifier;

public class BaseDecorator implements Notifier {

    private Notifier wrapper;

    public BaseDecorator(Notifier wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public void send(String... messages) {
        wrapper.send(messages);
    }
}
