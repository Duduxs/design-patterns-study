package solid.dip.exampleThree.right;

/**
 * Agora recebemos a interface e não precisamos nos preocupar com suas implementações, pois agora dependemos das abstrações.
 */
public class Driver {

    Car car;

    public Driver(Car car) { this.car = car; }

    public void increaseSpeed() {
        car.accelerate();
    }

}

interface Car {
    void accelerate();
}

class RacingCar implements Car {

    int fuel;

    public RacingCar(int fuel) {
        this.fuel = fuel;
    }

    @Override
    public void accelerate() {
        --fuel;
        System.out.println("Car is accelrating!");
    }


}
