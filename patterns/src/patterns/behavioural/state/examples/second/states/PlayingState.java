package patterns.behavioural.state.examples.second.states;

import patterns.behavioural.state.examples.second.PlayerContext;

public class PlayingState extends State {

    public PlayingState(PlayerContext player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.setState(new LockedState(player));
        player.setCurrentTrackAfterStop();
        return "Stop playing";
    }

    @Override
    public String onPlay() {
        player.setState(new PlayingState(player));
        return "Paused...";
    }

    @Override
    public String onNext() {
        return player.nextTrack();
    }

    @Override
    public String onPrevious() {
        return player.previousTrack();
    }
}
