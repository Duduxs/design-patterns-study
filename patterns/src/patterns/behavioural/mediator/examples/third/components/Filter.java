package patterns.behavioural.mediator.examples.third.components;

import patterns.behavioural.mediator.examples.third.Note;
import patterns.behavioural.mediator.examples.third.mediators.Mediator;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Filter extends JTextField implements Component {

    private Mediator mediator;
    private ListModel listModel;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setListModel(ListModel listModel) {
        this.listModel = listModel;
    }

    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        String start = getText();
        searchElements(start);
    }

    private void searchElements(String s) {
        if (listModel == null) {
            return;
        }

        if (s.equals("")) {
            mediator.setElementsList(listModel);
            return;
        }

        ArrayList<Note> notes = new ArrayList<>();
        for (int i = 0; i < listModel.getSize(); i++) {
            notes.add((Note) listModel.getElementAt(i));
        }
        DefaultListModel<Note> listModel = new DefaultListModel<>();
        for (Note note : notes) {
            if (note.getName().contains(s)) {
                listModel.addElement(note);
            }
        }
        mediator.setElementsList(listModel);
    }

    @Override
    public String getName() {
        return "Filter";
    }

}
