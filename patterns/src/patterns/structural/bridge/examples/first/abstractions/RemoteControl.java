package patterns.structural.bridge.examples.first.abstractions;

import patterns.structural.bridge.examples.first.implementations.DeviceImplementation;

public abstract class RemoteControl {

    protected DeviceImplementation device;

    public RemoteControl(DeviceImplementation device) {
        this.device = device;
    }

   public void togglePower() {
        this.device.setPower(!this.device.getPower());

        System.out.println(this.device.getName() + " power status: " + this.device.getPower());

    }
}
