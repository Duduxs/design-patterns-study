package patterns.behavioural.command.examples.second;

import patterns.behavioural.command.examples.second.command.Command;
import patterns.behavioural.command.examples.second.command.CopyCommand;
import patterns.behavioural.command.examples.second.command.CutCommand;
import patterns.behavioural.command.examples.second.command.PasteCommand;

import javax.swing.*;
import java.awt.*;
import java.util.stream.Stream;

import static java.awt.FlowLayout.CENTER;
import static javax.swing.BoxLayout.Y_AXIS;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Editor {

    public JTextArea textField;
    public String clipboard;
    private CommandHistory history = new CommandHistory();

    public void init() {
        JFrame frame = new JFrame("Text editor (type & use panel, Luke!)");
        JPanel content = new JPanel();

        frame.setContentPane(content);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        content.setLayout(new BoxLayout(content, Y_AXIS));

        textField = new JTextArea();
        textField.setForeground(Color.white);
        textField.setLineWrap(true);

        content.add(textField);

        JPanel panel = new JPanel(new FlowLayout(CENTER));

        JButton ctrlC = new JButton("Ctrl+C");
        JButton ctrlX = new JButton("Ctrl+X");
        JButton ctrlV = new JButton("Ctrl+V");
        JButton ctrlZ = new JButton("Ctrl+Z");

        Editor editor = this;

        ctrlC.addActionListener(e -> executeCommand(new CopyCommand(editor)));
        ctrlX.addActionListener(e -> executeCommand(new CutCommand(editor)));
        ctrlV.addActionListener(e -> executeCommand(new PasteCommand(editor)));
        ctrlZ.addActionListener(e -> undoCommand());

        Stream.of(ctrlC, ctrlX, ctrlV, ctrlZ).forEach(panel::add);

        content.add(panel);

        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }

    private void executeCommand(Command command) {
        if(command.execute()) {
            history.push(command);
        }
    }

    private void undoCommand() {
        if(history.isEmpty()) return;

        Command command = history.pop();

        if(command != null) {
            command.undo();
        }
    }

}
