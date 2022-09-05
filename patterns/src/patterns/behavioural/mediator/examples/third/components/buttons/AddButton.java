package patterns.behavioural.mediator.examples.third.components.buttons;

import patterns.behavioural.mediator.examples.third.Note;
import patterns.behavioural.mediator.examples.third.components.Component;
import patterns.behavioural.mediator.examples.third.mediators.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddButton extends JButton implements Component {

    private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
}
