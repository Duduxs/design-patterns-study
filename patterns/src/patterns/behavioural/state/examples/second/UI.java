package patterns.behavioural.state.examples.second;

import javax.swing.*;
import java.awt.*;

import static java.awt.FlowLayout.CENTER;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class UI {

    private PlayerContext player;
    private static JTextField textField = new JTextField();

    public UI(PlayerContext player) {
        this.player = player;
    }

    public void init() {

        JFrame frame = new JFrame("Test player");

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel context = new JPanel();

        context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));

        frame.getContentPane().add(context);

        JPanel buttons = new JPanel(new FlowLayout(CENTER));

        context.add(textField);
        context.add(buttons);

        // Context delegates handling user's input to a state object. Naturally,
        // the outcome will depend on what state is currently active, since all
        // states can handle the input differently.
        JButton play = new JButton("Play");
        play.addActionListener(e -> textField.setText(player.getState().onPlay()));

        JButton stop = new JButton("Stop");
        stop.addActionListener(e -> textField.setText(player.getState().onLock()));

        JButton prev = new JButton("Prev");
        prev.addActionListener(e -> textField.setText(player.getState().onPrevious()));

        JButton next = new JButton("Next");
        next.addActionListener(e -> textField.setText(player.getState().onNext()));

        frame.setVisible(true);
        frame.setSize(300, 100);

        buttons.add(play);
        buttons.add(stop);
        buttons.add(next);
        buttons.add(prev);
    }

}
