package patterns.structural.decorator.examples.first;

import patterns.structural.decorator.examples.first.decorators.BaseDecorator;
import patterns.structural.decorator.examples.first.decorators.FacebookDecorator;
import patterns.structural.decorator.examples.first.decorators.SlackDecorator;
import patterns.structural.decorator.examples.first.decorators.SmsDecorator;
import patterns.structural.decorator.examples.first.notifiers.EmailNotifier;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        var receivers = List.of("Eduardo", "Jõao", "Letícia");

        BaseDecorator myCustomNotificationStack = new FacebookDecorator(
                new SmsDecorator(new EmailNotifier(receivers))
        );

        myCustomNotificationStack.send("Love you all", "How are you ppl?");

        System.out.println();

        var emailNotifier = new EmailNotifier(receivers);
        var slackDecorator = new SlackDecorator(emailNotifier);
        var smsDecorator = new SmsDecorator(slackDecorator);

        BaseDecorator myCustomNotificationStack2 = new FacebookDecorator(smsDecorator);

        myCustomNotificationStack2.send("Some urgency message");
    }
}
