package patterns.behavioural.state.examples.second.states;

import patterns.behavioural.state.examples.second.PlayerContext;

/**
 * Concrete states provide the special implementation for all interface methods.
 */
public class LockedState extends State {
    LockedState(PlayerContext player) {
        super(player);
        player.setPlaying(false);
    }

    @Override
    public String onLock() {

        if(player.isPlaying()) {
            player.setState(new ReadyState(player));
            return "Stop playing";
        }

        return "Locked...";

    }

    @Override
    public String onPlay() {
        player.setState(new ReadyState(player));
        return "Ready";
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
