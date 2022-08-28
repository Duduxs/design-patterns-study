package patterns.behavioural.command.examples.first;

import patterns.behavioural.command.examples.first.commands.SmartHouseCommand;

import java.util.HashMap;
import java.util.Map;

public class SmartHouseApp {

    private Map<String, SmartHouseCommand> commands = new HashMap();

    public void addCommand(String key, SmartHouseCommand command) {
        this.commands.put(key, command);
    }

    public void executeCommand(String key) {
        this.commands.get(key).execute();
    }

    public void undoCommand(String key) {
        this.commands.get(key).undo();
    }

}
