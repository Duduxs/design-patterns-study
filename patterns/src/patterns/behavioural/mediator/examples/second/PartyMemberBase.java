package patterns.behavioural.mediator.examples.second;

import patterns.behavioural.mediator.examples.second.mediators.Party;


public abstract class PartyMemberBase implements PartyMember {

    protected Party party;

    @Override
    public void joinedParty(Party party) {
        System.out.println(this + " join the party");
        this.party = party;
    }

    @Override
    public void partyAction(Action action) {
        System.out.println(this + " " + action.getDescription());
    }

    @Override
    public void act(Action action) {
        if(party != null) {
            party.act(this, action);
        }
    }

    public abstract String toString();

}
