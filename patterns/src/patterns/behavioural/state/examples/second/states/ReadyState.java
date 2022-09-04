package patterns.behavioural.state.examples.second.states;

import patterns.behavioural.state.examples.second.PlayerContext;

/**
 * They can also trigger state transitions in the context
 */
public class ReadyState extends State {

    public ReadyState(PlayerContext player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.setState(new LockedState(player));
        return "Locked...";
    }

    @Override
    public String onPlay() {
        String action = player.startPlayback();
        player.setState(new PlayingState(player));
        return action;
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        return "Locked...";
    }


}
