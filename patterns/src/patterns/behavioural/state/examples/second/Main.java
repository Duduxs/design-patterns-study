package patterns.behavioural.state.examples.second;

public class Main {

    public static void main(String[] args) {

        PlayerContext player = new PlayerContext();

        UI ui = new UI(player);
        ui.init();

    }

}
