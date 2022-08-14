package patterns.structural.decorator.examples.first.notifiers;

import java.util.ArrayList;
import java.util.Collection;

public final class EmailNotifier implements Notifier {

    private Collection<String> receivers = new ArrayList<>();
    
    public EmailNotifier() {};
    
    public EmailNotifier(Collection<String> receivers) {
        this.receivers = receivers;
    }
    
    @Override
    public void send(String... messages) {
        if(receivers.isEmpty()) throw new IllegalStateException("You must send a email to at least one person.");

        try {
            System.out.println();
            System.out.println("Preparing to send email to " + String.join(",", receivers));
            Thread.sleep(1000);
            System.out.println("Email sended with success!");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Fail to send email!");
        }
    }
}
