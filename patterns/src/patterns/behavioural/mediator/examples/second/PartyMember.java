package patterns.behavioural.mediator.examples.second;

import patterns.behavioural.mediator.examples.second.mediators.Party;

public interface PartyMember {

    void joinedParty(Party party);

    void partyAction(Action action);

    void act(Action action);

}
