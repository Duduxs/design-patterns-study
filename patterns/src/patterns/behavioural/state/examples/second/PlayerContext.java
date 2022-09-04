package patterns.behavioural.state.examples.second;

import patterns.behavioural.state.examples.second.states.ReadyState;
import patterns.behavioural.state.examples.second.states.State;

import java.util.ArrayList;
import java.util.List;

public class PlayerContext {

    private State state;
    private boolean isPlaying = false;
    private List<String> playlist = new ArrayList<>();
    private int currentTrack = 0;

    public PlayerContext() {
        this.state = new ReadyState(this);
        setPlaying(true);

        for(int i = 0 ; i <= 12; i++) {
            playlist.add("Cool track " + i);
        }

    }

    public State getState() { return state; }

    public void setState(State state) { this.state = state; }

    public boolean isPlaying() { return isPlaying; }

    public void setPlaying(boolean playing) { isPlaying = playing; }

    public String startPlayback() {
        return "Playing " + playlist.get(currentTrack);
    }

    public String nextTrack() {
        currentTrack++;

        if(currentTrack > playlist.size() - 1) {
            currentTrack = 0;
        }

        return "Playing " + playlist.get(currentTrack);

    }

    public String previousTrack() {
        currentTrack--;

        if(currentTrack < 0) {
            currentTrack = playlist.size() - 1;
        }

        return "Playing " + playlist.get(currentTrack);

    }

    public void setCurrentTrackAfterStop() {
        this.currentTrack = 0;
    }

}
