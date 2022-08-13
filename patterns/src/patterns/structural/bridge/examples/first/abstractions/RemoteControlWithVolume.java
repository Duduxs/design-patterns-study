package patterns.structural.bridge.examples.first.abstractions;

import patterns.structural.bridge.examples.first.implementations.DeviceImplementation;

public class RemoteControlWithVolume extends RemoteControl {

    public RemoteControlWithVolume(DeviceImplementation device) {
        super(device);
    }

    public void volumeUp() {
        int oldVolume = this.device.getVolume();

        this.device.setVolume(this.device.getVolume() + 10);

        System.out.println(this.device.getName() + " had the volume " + oldVolume + " now it has " + this.device.getVolume());
    }

    public void volumeDown() {
        int oldVolume = this.device.getVolume();

        this.device.setVolume(this.device.getVolume() - 10);

        System.out.println(this.device.getName() + " had the volume " + oldVolume + " now it has " + this.device.getVolume());
    }


}
