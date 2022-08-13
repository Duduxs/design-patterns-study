package patterns.structural.bridge.examples.first.abstractions;

import patterns.structural.bridge.examples.first.implementations.DeviceImplementation;

public class AdvancedRemote extends RemoteControl {

    public AdvancedRemote(DeviceImplementation device) {
        super(device);
    }

    //I could put volumeUp and down methods here, but I hope that you understood that this class is
    // an advanced remote.
    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }


}
