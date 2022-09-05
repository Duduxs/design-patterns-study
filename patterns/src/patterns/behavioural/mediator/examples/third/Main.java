package patterns.behavioural.mediator.examples.third;

import patterns.behavioural.mediator.examples.third.components.Filter;
import patterns.behavioural.mediator.examples.third.components.List;
import patterns.behavioural.mediator.examples.third.components.TextBox;
import patterns.behavioural.mediator.examples.third.components.Title;
import patterns.behavioural.mediator.examples.third.components.buttons.AddButton;
import patterns.behavioural.mediator.examples.third.components.buttons.DeleteButton;
import patterns.behavioural.mediator.examples.third.components.buttons.SaveButton;
import patterns.behavioural.mediator.examples.third.mediators.EditorMediator;
import patterns.behavioural.mediator.examples.third.mediators.Mediator;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Mediator mediator = new EditorMediator();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();

    }

}
