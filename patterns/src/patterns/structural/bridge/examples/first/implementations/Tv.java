package patterns.structural.bridge.examples.first.implementations;

public class Tv implements DeviceImplementation{

    private int volume = 10;
    private boolean power = false;
    private String name = "TV";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean getPower() {
        return power;
    }

    @Override
    public void setPower(Boolean powerStatus) {
        this.power = powerStatus;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if(volume < 0) return;
        if(volume > 100) return;
        
        this.volume = volume;
    }
}
