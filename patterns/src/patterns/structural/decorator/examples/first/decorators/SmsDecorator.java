package patterns.structural.decorator.examples.first.decorators;

import patterns.structural.decorator.examples.first.notifiers.Notifier;

public class SmsDecorator extends BaseDecorator {
    public SmsDecorator(Notifier wrapper) {
        super(wrapper);
    }

    @Override
    public void send(String... messages) {
        super.send(messages);
        System.out.println();
        System.out.println("SMS notification send with success!");
    }
}
