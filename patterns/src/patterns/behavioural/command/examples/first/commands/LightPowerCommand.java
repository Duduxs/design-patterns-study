package patterns.behavioural.command.examples.first.commands;

import patterns.behavioural.command.examples.first.SmartHouseLight;

public class LightPowerCommand implements SmartHouseCommand {

    private SmartHouseLight receiver;

    public LightPowerCommand(SmartHouseLight light) {
        this.receiver = light;
    }

    @Override
    public void execute() {
        receiver.on();
    }

    @Override
    public void undo() {
        receiver.off();
    }

}
