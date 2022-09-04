package patterns.behavioural.mediator.examples.second;

import patterns.behavioural.mediator.examples.second.components.Hobbit;
import patterns.behavioural.mediator.examples.second.components.Hunter;
import patterns.behavioural.mediator.examples.second.components.Rogue;
import patterns.behavioural.mediator.examples.second.components.Wizard;
import patterns.behavioural.mediator.examples.second.mediators.PartyImpl;

import static patterns.behavioural.mediator.examples.second.Action.*;

public class Main {

    public static void main(String[] args) {

        var party = new PartyImpl();

        var hobbit = new Hobbit();
        var wizard = new Wizard();
        var rogue = new Rogue();
        var hunter = new Hunter();

        party.addMember(hobbit, wizard, rogue, hunter);

        System.out.println();

        hobbit.act(ENEMY);
        wizard.act(TALE);
        rogue.act(GOLD);
        hunter.act(HUNT);

    }

}
