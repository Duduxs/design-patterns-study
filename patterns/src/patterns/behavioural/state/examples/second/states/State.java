package patterns.behavioural.state.examples.second.states;

import patterns.behavioural.state.examples.second.PlayerContext;

public abstract class State {
    PlayerContext player;


    State(PlayerContext player) {
        this.player = player;
    }


    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();

}
