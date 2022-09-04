package patterns.behavioural.mediator.examples.second.mediators;

import patterns.behavioural.mediator.examples.second.Action;
import patterns.behavioural.mediator.examples.second.PartyMember;

public interface Party {

    void addMember(PartyMember ...member);

    void act(PartyMember actor, Action action);

}
