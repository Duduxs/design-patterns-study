package patterns.structural.bridge.examples.first;

import patterns.structural.bridge.examples.first.abstractions.AdvancedRemote;
import patterns.structural.bridge.examples.first.abstractions.SimpleRemote;
import patterns.structural.bridge.examples.first.implementations.Radio;
import patterns.structural.bridge.examples.first.implementations.Tv;

public class Main {

    public static void main(String[] args) {

        var tv = new Tv();
        var radio = new Radio();

        var control = new SimpleRemote(tv);

        //true
        control.togglePower();

        control.volumeUp(); //20
        control.volumeUp(); //30
        control.volumeDown(); // 20

        var otherControl = new AdvancedRemote(radio);

        otherControl.togglePower();

        otherControl.mute();



    }
}
