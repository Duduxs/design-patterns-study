package patterns.structural.bridge.examples.first.abstractions;

import patterns.structural.bridge.examples.first.implementations.DeviceImplementation;

public class AdvancedRemote extends RemoteControl {

    public AdvancedRemote(DeviceImplementation device) {
        super(device);
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }


}
