package patterns.behavioural.mediator.examples.second.mediators;

import patterns.behavioural.mediator.examples.second.Action;
import patterns.behavioural.mediator.examples.second.PartyMember;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartyImpl implements Party {

    private final List<PartyMember> members;

    public PartyImpl() {
        this.members = new ArrayList<>();
    }

    @Override
    public void act(PartyMember actor, Action action) {
        for (var member : members) {
            if (!member.equals(actor)) {
                member.partyAction(action);
            }
        }
        System.out.println();
    }

    @Override
    public void addMember(PartyMember ...member) {
        Arrays.stream(member).forEach(m -> {
            members.add(m);
            m.joinedParty(this);
        });
    }
}
