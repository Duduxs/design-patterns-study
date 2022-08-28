package patterns.behavioural.command.examples.first;

import patterns.behavioural.command.examples.first.commands.LightIntensityCommand;
import patterns.behavioural.command.examples.first.commands.LightPowerCommand;

public class Main {

    public static void main(String[] args) {

        //invoker
        var smartHouseApp = new SmartHouseApp();

        //receivers
        var bedroomLight = new SmartHouseLight("Bedroom light");
        var bathroomLight = new SmartHouseLight("Bathroom light");

        //commands
        var lightPowerCommand = new LightPowerCommand(bedroomLight);
        var bathroomPowerCommand = new LightPowerCommand(bathroomLight);

        smartHouseApp.addCommand("btn-1", lightPowerCommand);
        smartHouseApp.addCommand("btn-2", bathroomPowerCommand);

        smartHouseApp.executeCommand("btn-1");
        smartHouseApp.undoCommand("btn-1");

        smartHouseApp.executeCommand("btn-2");
        smartHouseApp.undoCommand("btn-2");


        //more commands
        var bedroomIntensityCommand = new LightIntensityCommand(bedroomLight);

        smartHouseApp.addCommand("btn-3", bedroomIntensityCommand);

        smartHouseApp.executeCommand("btn-3");
        smartHouseApp.executeCommand("btn-3");
        smartHouseApp.executeCommand("btn-3");
        smartHouseApp.undoCommand("btn-3");
        smartHouseApp.undoCommand("btn-3");
        smartHouseApp.undoCommand("btn-3");

    }
}
