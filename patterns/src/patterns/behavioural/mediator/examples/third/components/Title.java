package patterns.behavioural.mediator.examples.third.components;


import patterns.behavioural.mediator.examples.third.mediators.Mediator;

import javax.swing.*;
import java.awt.event.KeyEvent;

public class Title extends JTextField implements Component {

    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return "Title";
    }
}
