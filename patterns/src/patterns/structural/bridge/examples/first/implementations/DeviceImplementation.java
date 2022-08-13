package patterns.structural.bridge.examples.first.implementations;

public interface DeviceImplementation {

    String getName();

    boolean getPower();
    void setPower(Boolean powerStatus);

    int getVolume();
    void setVolume(int volume);

}
