package patterns.structural.decorator.examples.first.decorators;

import patterns.structural.decorator.examples.first.notifiers.Notifier;

public class SlackDecorator extends BaseDecorator {
    public SlackDecorator(Notifier wrapper) {
        super(wrapper);
    }

    @Override
    public void send(String... messages) {
        System.out.println();
        System.out.println("Slack notification send with success!");
        super.send(messages);
    }

}
