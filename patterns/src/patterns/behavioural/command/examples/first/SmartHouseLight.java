package patterns.behavioural.command.examples.first;

public class SmartHouseLight {

    private boolean isOn = false;
    private int intensity = 50;
    private String name;

    public SmartHouseLight(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPowerStatus() {
        return this.isOn ? "ON" : "OFF";
    }

    public boolean on() {
        this.isOn = true;
        System.out.println(name + " is " + getPowerStatus());
        return true;
    }

    public boolean off() {
        this.isOn = false;
        System.out.println(name + " is " + getPowerStatus());
        return false;
    }

    public Integer increaseIntensity() {
        if (this.intensity >= 100) return this.intensity;

        this.intensity += 1;
        return this.intensity;
    }

    public Integer decreaseIntensity() {
        if (this.intensity <= 0) return this.intensity;

        this.intensity -= 1;
        return this.intensity;
    }

}
