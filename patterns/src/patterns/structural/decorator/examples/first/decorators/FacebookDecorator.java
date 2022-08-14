package patterns.structural.decorator.examples.first.decorators;

import patterns.structural.decorator.examples.first.notifiers.Notifier;

public class FacebookDecorator extends BaseDecorator {

    public FacebookDecorator(Notifier wrapper) {
        super(wrapper);
    }

    @Override
    public void send(String... messages) {
        try {
            System.out.println();
            System.out.println("Preparing to send facebook notification");
            Thread.sleep(1000);
            System.out.println("Checking accounts");
            Thread.sleep(1000);
            System.out.println("Making some shit");
            Thread.sleep(1000);
            System.out.println("Done! Facebook notification sent");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Fail to send facebook notification");
        }

        super.send(messages);
    }
}
