package patterns.structural.bridge.examples.first;

import patterns.structural.bridge.examples.first.abstractions.RemoteControlWithVolume;
import patterns.structural.bridge.examples.first.implementations.Radio;
import patterns.structural.bridge.examples.first.implementations.Tv;

public class Main {

    public static void main(String[] args) {

        var tv = new Tv();
        var radio = new Radio();

        var control = new RemoteControlWithVolume(tv);

        //true
        control.togglePower();

        control.volumeUp(); //20
        control.volumeUp(); //30
        control.volumeDown(); // 20

        var otherControl = new RemoteControlWithVolume(radio);

        otherControl.togglePower();

        otherControl.volumeUp();



    }
}
