package patterns.behavioural.command.examples.first.commands;

import patterns.behavioural.command.examples.first.SmartHouseLight;

public class LightIntensityCommand implements SmartHouseCommand {

    private SmartHouseLight receiver;

    public LightIntensityCommand(SmartHouseLight light) {
        this.receiver = light;
    }

    @Override
    public void execute() {

        var intensity = receiver.increaseIntensity();
        System.out.println(receiver.getName() + " intensity " + intensity);
    }

    @Override
    public void undo() {
        var intensity = receiver.decreaseIntensity();
        System.out.println(receiver.getName() + " intensity " + intensity);
    }

}
